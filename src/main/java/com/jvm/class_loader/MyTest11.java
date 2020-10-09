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
public class MyTest11 {

    public static void main(String[] args) {
        System.out.println(Child3.a);
        System.out.println("---------------");
        Child3.doSomeThing();
    }
}
class Parent3{
    static int a =3;
    static{
        System.out.println("parent3 static block");
    }
    static void doSomeThing(){
        System.out.println("do something");
    }
}

class Child3 extends  Parent3{

    static {
        System.out.println("child3 static block");
    }
}