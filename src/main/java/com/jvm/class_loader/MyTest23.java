package com.jvm.class_loader;


import sun.misc.Launcher;

/**
 * 在运行期,一个java类是由该类的全限定名和用于加载该类的定义类加载器(defining loader 实际加载该类的类加载器)所共同决定的.
 * 如果完全像定名相同的类由不同的两个类加载器所加载,那么这些类就是不同的,即时.class字节码文件完全一样,并且从相同的位置加载亦是如此.
 *
 * 在Oracle的HotSpot视线中,系统属性sun.boot.class.path如果修改错了,则运行出错,会出现如下错误
 * Error occurred during initialization of VM
 * java/lang/NoClassDefFoundError: java/lang/Object
 *
 * 内建于jvm中的启动类加载器会加载java.lang.ClassLoader以及其它的java平台类,当jvm启动时,
 * 一块特殊的机器码会运行,他就会加载扩展类加载器和系统类加载器,这块特殊的机器码基座启动类加载器
 * 启动类加载器并不是java类,是使用C++写的,而其它的加载器都是java类
 * 启动类加载器是特定于平台的机器指令,它负责开启整个加载过程
 *
 * 所有类加载器(除了启动类加载器)都被实现为java类.不过总归要有一个组件来加载第一个java类加载器,从而让整个加载过程能够顺利进行下去,加载第一个纯java类加载器就是启动类加载器的职责
 *
 * 启动类加载器还会加载共JRE正常运行所需要的基本组件,包括java.util与java.lang包中的类
 *
 * @author lishanglei
 * @version v1.0.0
 * @date 2020/10/10
 * @Description Modification History:
 * Date                 Author          Version          Description
 * ---------------------------------------------------------------------------------*
 * 2020/10/10              lishanglei      v1.0.0           Created
 */
public class MyTest23 {

    public static void main(String[] args) throws ClassNotFoundException {

        System.out.println("根类加载器加载路径: "+System.getProperty("sun.boot.class.path"));
        System.out.println("拓展类加载器加载路径: "+System.getProperty("java.ext.dirs"));
        System.out.println("系统类加载器加载路径: "+System.getProperty("java.class.path"));

        System.out.println(ClassLoader.class.getClassLoader());

        System.out.println(Launcher.class.getClassLoader());

        System.out.println(System.getProperty("java.system.class.loader"));


    }
}
