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
public class MyTest10 {

    static {
        System.out.println("MyTest9 static block");
    }

    public static void main(String[] args) {
        Parent2 parent2;
        System.out.println("=================");
        parent2=new Parent2();
        System.out.println("================");
        System.out.println(parent2.a);
        System.out.println("==================");
        System.out.println(Child2.b);
    }
}


class Parent2{
    static int a =3;
    static{
        System.out.println("parent2 static block");
    }
}

class Child2 extends  Parent2{

    static int b =4;
    static {
        System.out.println("child2 static block");
    }
}