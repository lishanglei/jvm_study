package com.jvm.class_loader;

/**
 * @author lishanglei
 * @version v1.0.0
 * @date 2020/9/29
 * @Description Modification History:
 * Date                 Author          Version          Description
 * ---------------------------------------------------------------------------------*
 * 2020/9/29              lishanglei      v1.0.0           Created
 */
public class MyTest7 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> stringClass = Class.forName("java.lang.String");
        System.out.println("String 的类加载器: "+stringClass.getClassLoader());

        Class<?> aClass = Class.forName("com.jvm.class_loader.A");
        System.out.println("A 的类加载器: "+aClass.getClassLoader());

    }

}

class A{

}