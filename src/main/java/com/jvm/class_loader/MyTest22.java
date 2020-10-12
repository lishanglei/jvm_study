package com.jvm.class_loader;

/**
 * @author lishanglei
 * @version v1.0.0
 * @date 2020/10/10
 * @Description Modification History:
 * Date                 Author          Version          Description
 * ---------------------------------------------------------------------------------*
 * 2020/10/10              lishanglei      v1.0.0           Created
 */
public class MyTest22 {

    static {
        System.out.println("MyTest22 initializer");
    }
    public static void main(String[] args) {

        System.out.println(MyTest22.class.getClassLoader());
        System.out.println(MyTest1.class.getClassLoader());

    }
}
