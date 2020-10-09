package com.jvm.class_loader;


/**
 * @author lishanglei
 * @version v1.0.0
 * @date 2020/9/30
 * @Description Modification History:
 * Date                 Author          Version          Description
 * ---------------------------------------------------------------------------------*
 * 2020/9/30              lishanglei      v1.0.0           Created
 */
public class MyTest9 {

    static {
        System.out.println("MyTest9 static block");
    }

    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println(Child.b);

    }


}


class Parent{
    static int a =3;
    static{
        System.out.println("parent static block");
    }
}

class Child extends  Parent{

    static int b =4;
    static {
        System.out.println("child static block");
    }
}


