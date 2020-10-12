package com.jvm.class_loader;

/**
 * @author lishanglei
 * @version v1.0.0
 * @date 2020/10/9
 * @Description Modification History:
 * Date                 Author          Version          Description
 * ---------------------------------------------------------------------------------*
 * 2020/10/9              lishanglei      v1.0.0           Created
 */
public class MyTest18_1 {

    public static void main(String[] args) throws ClassNotFoundException {
        MyTest16 loader1 =new MyTest16("loader1");
        loader1.setPath("C:\\Users\\10025\\Desktop\\");
        Class<?> clazz = loader1.loadClass("com.jvm.class_loader.MyTest1");
        System.out.println("class: "+clazz.hashCode());
        System.out.println("class loader: "+clazz.getClassLoader());
    }
}
