package com.jvm.class_loader;

import java.util.Date;

/**
 * @author lishanglei
 * @version v1.0.0
 * @date 2020/9/29
 * @Description Modification History:
 * Date                 Author          Version          Description
 * ---------------------------------------------------------------------------------*
 * 2020/9/29              lishanglei      v1.0.0           Created
 */
public class MyTest5_1 {

    public static void main(String[] args) {
        C c =new C();
        C c1 =new C();
        System.out.println(MyChild5_1.b);

    }

}
interface  MyGrandpa{
    public static Thread thread =new Thread(){
        {
            System.out.println("MyGrandpa invoked");
        }
    };
}
class MyParent5_1{

    public static Thread thread =new Thread(){
        {
            System.out.println("MyParent5_1 invoked");
        }
    };
}

class MyChild5_1 extends MyParent5_1{
    public static int b =5;
}

class C{

    public static int c =6;
    {
        System.out.println("我在每个实例被创建时执行且在构造方法前执行");
    }
    public C(){
        System.out.println("我是构造方法");
    }
    static {
        System.out.println("我是静态代码块,我在初始化时执行,且只执行一次");
    }
}