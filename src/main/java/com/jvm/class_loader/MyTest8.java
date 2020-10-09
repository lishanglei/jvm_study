package com.jvm.class_loader;

import java.util.Random;

/**
 * @author lishanglei
 * @version v1.0.0
 * @date 2020/9/30
 * @Description Modification History:
 * Date                 Author          Version          Description
 * ---------------------------------------------------------------------------------*
 * 2020/9/30              lishanglei      v1.0.0           Created
 */
public class MyTest8 {


    public static void main(String[] args) {
        System.out.println(FinalTest.x);
    }
}

class FinalTest{

    public static final int x=3;
    static {
        System.out.println("FinalTest static block");
    }
}