package com.jvm.class_loader;

import com.sun.org.apache.regexp.internal.RE;

/**
 * @author lishanglei
 * @version v1.0.0
 * @date 2020/9/28
 * @Description Modification History:
 * Date                 Author          Version          Description
 * ---------------------------------------------------------------------------------*
 * 2020/9/28              lishanglei      v1.0.0           Created
 */
public class MyTest6 {

    public static void main(String[] args) {
        Singleton singleton =Singleton.getInstance();
        System.out.println(Singleton.counter1);
        System.out.println(Singleton.counter2);
    }
}
class Singleton{
    public static int counter1;

    private static Singleton singleton =new Singleton();
    private Singleton(){
        counter1++;
        counter2++;
        System.out.println("counter1: "+counter1);
        System.out.println("counter2: "+counter2);
    }
    public static int counter2=0;

    public static Singleton getInstance(){
        return singleton;
    }
}


