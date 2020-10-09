package com.jvm.class_loader;

import java.util.Random;

/**
 * 接口中的字段,默认被public static final修饰
 * 删除MyParent5的字节码文件,依然没有问题.表明:
 * 当一个接口在初始化时,并不要求其父接口都完成了初始化.
 * 删除了MyChild5的字节码文件,依然没有问题.表明:
 * b的值在运行期已经确定,也会将b的值放置到MyTest5常量池中,此时与MyChild5不在有任何关系
 * 只有在真正使用父接口的时候(如引用接口中所定义的常量时,才会初始化)
 * @author lishanglei
 * @version v1.0.0
 * @date 2020/9/28
 * @Description Modification History:
 * Date                 Author          Version          Description
 * ---------------------------------------------------------------------------------*
 * 2020/9/28              lishanglei      v1.0.0           Created
 */
public class MyTest5 {

    public static void main(String[] args) {
        System.out.println(MyChild5.b);
    }
}

interface MyParent5 {
   int a = 5;
   int c =new Random().nextInt(3);
}

interface  MyChild5 extends  MyParent5{
    int b =6;
}
