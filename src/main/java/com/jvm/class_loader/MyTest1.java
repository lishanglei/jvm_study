package com.jvm.class_loader;

/**
 * 对于静态字段来说,只有直接定义了该字段的类才会被初始化
 * -XX:+TraceClassLoading 用于追踪类的加载信息并打印出来
 *
 * jvm指令:
 * -XX:+<option>            表示开启option选项
 * -XX:-<option>            表示关闭option选项
 * -XX:<option>=<value>     表示将option选项的值设置为value
 * @author lishanglei
 * @version v1.0.0
 * @date 2020/9/28
 * @Description Modification History:
 * Date                 Author          Version          Description
 * ---------------------------------------------------------------------------------*
 * 2020/9/28              lishanglei      v1.0.0           Created
 */
public class MyTest1 {

    public static void main(String[] args) {
        //System.out.println(MyChild1.str);
        System.out.println(MyChild1.str2);
    }
}

class MyParent1{

    public static String str ="hello world";
    static{
        System.out.println("MyParent1 static block");
    }
}

class MyChild1 extends  MyParent1{

    public static String str2 ="welcome";
    static {
        System.out.println("MyChild1 static block");
    }
}