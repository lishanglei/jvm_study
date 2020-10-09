package com.jvm.class_loader;

import java.io.*;

/**
 * **类加载器的命名空间:**
 *
 * 每个类加载器都有自己的命名空间,命名空间由该类加载器及所有父类加载器所加载的类组成
 *
 * 在同一个命名空间中,不会出现类的全限定名完全相同的两个类
 *
 * 在不同的命名空间中,有可能会出现类的全限定名完全相同的两个类
 *
 * 1. 当项目中存在MyTest1.class文件时,会由系统类加载器进行加载
 * 2. 删除项目中的MyTest1.class文件,在桌面com\jvm\class_loader目录下增加MyTest1.class文件,会由我们自定义的类加载器进行加载,
 *    并且不同的类加载器都可以加载该文件,因为不同类加载器的命名空间不同
 *
 * @author lishanglei
 * @version v1.0.0
 * @date 2020/10/9
 * @Description Modification History:
 * Date                 Author          Version          Description
 * ---------------------------------------------------------------------------------*
 * 2020/10/9              lishanglei      v1.0.0           Created
 */
public class MyTest16 extends ClassLoader {

    private String classLoaderName;

    private final String fileExtension = ".class";

    //加载类的路径
    private String path;

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * @param classLoaderName 类加载器的名字
     *                        <p>
     * Creates a new class loader using the <tt>ClassLoader</tt> returned by
     * the method {@link #getSystemClassLoader()
     * <tt>getSystemClassLoader()</tt>} as the parent class loader.
     */
    public MyTest16(String classLoaderName) {

        //将系统类加载器当作该类加载器的父类加载器
        super();
        this.classLoaderName = classLoaderName;
    }

    public MyTest16(ClassLoader parentClassLoader, String classLoaderName) {
        //显示指定该类加载器的父类加载器
        super(parentClassLoader);
        this.classLoaderName = classLoaderName;
    }

    /**
     * 根据二进制的类的名字查找类,并返回其Class对象
     *
     * @param className
     * @return
     * @throws ClassNotFoundException
     */
    @Override
    protected Class<?> findClass(String className) throws ClassNotFoundException {
        System.out.println("findClass invoked");
        byte[] data = this.loadClassData(className);

        //将字节数组转化为类的Class对象
        return this.defineClass(className, data, 0, data.length);
    }

    /**
     * 根据类的名字返回类数据的字节数组
     *
     * @param clasaName
     * @return
     */
    private byte[] loadClassData(String clasaName) {

        System.out.println("loadClassData invoked");
        InputStream in = null;
        byte[] data = null;
        ByteArrayOutputStream baos = null;
        clasaName = clasaName.replace(".", "\\");

        try {
            in = new FileInputStream(new File(this.path + clasaName + this.fileExtension));
            baos = new ByteArrayOutputStream();
            int ch = 0;
            while (-1 != (ch = in.read())) {
                baos.write(ch);
            }

            data = baos.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
                baos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return data;
    }


    @Override
    public String toString() {
        return "[ " + this.classLoaderName + " ]";
    }


    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {

        MyTest16 loader1 = new MyTest16("loader1");
        //loader1.setPath("D:\\mingbyte\\jvm_study\\target\\classes");
        loader1.setPath("C:\\Users\\10025\\Desktop\\");
        Class<?> aClass = loader1.loadClass("com.jvm.class_loader.MyTest1");

        //根据类的Class对象生成一个实例
        Object o = aClass.newInstance();
        System.out.println("o 的类加载器: "+o.getClass().getClassLoader());


        System.out.println();


        MyTest16 loader2 =new MyTest16("loader2");
        loader2.setPath("C:\\Users\\10025\\Desktop\\");
        Class<?> clazz = loader2.loadClass("com.jvm.class_loader.MyTest1");
        Object o2 = clazz.newInstance();
        System.out.println("o2 的类加载器: "+o2.getClass().getClassLoader());

        System.out.println();

        MyTest16 loader3 =new MyTest16(loader1,"loader3");
        loader3.setPath("C:\\Users\\10025\\Desktop\\");
        Class<?> clazz3 = loader3.loadClass("com.jvm.class_loader.MyTest1");
        Object o3 = clazz3.newInstance();
        System.out.println("o3 的类加载器: "+o3.getClass().getClassLoader());
    }


}
