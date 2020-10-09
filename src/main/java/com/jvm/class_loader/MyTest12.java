package com.jvm.class_loader;

/**
 * 加载并不会导致CL类的初始化
 * @author lishanglei
 * @version v1.0.0
 * @date 2020/9/30
 * @Description Modification History:
 * Date                 Author          Version          Description
 * ---------------------------------------------------------------------------------*
 * 2020/9/30              lishanglei      v1.0.0           Created
 */
public class MyTest12 {

    public static void main(String[] args) throws ClassNotFoundException {
        ClassLoader loader = ClassLoader.getSystemClassLoader();
        Class<?> aClass = loader.loadClass("com.jvm.class_loader.CL");
        System.out.println(
                aClass
        );
        System.out.println("---------------");
        aClass =Class.forName("com.jvm.class_loader.CL");
        System.out.println(aClass);
    }
}

class CL {
    static {
        System.out.println("Class CL");
    }
}