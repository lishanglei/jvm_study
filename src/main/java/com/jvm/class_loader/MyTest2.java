package com.jvm.class_loader;

/**
 * 常量在编译阶段会存入到调用这个常量的方法所在类的常量池中,
 * 本质上,调用类并没有直接引用到定义常量的类,因此并不会触发定义常量的类的初始化
 * 注意:这里指的是将常量存放到了MyTest2的常量池中,之后MyTest2与MyParent2就没有任何关系了
 * 甚至,我们可以将MyParent2的class文件删除
 * @author lishanglei
 * @version v1.0.0
 * @date 2020/9/28
 * @Description Modification History:
 * Date                 Author          Version          Description
 * ---------------------------------------------------------------------------------*
 * 2020/9/28              lishanglei      v1.0.0           Created
 */
public class MyTest2 {

    public static void main(String[] args) {
        System.out.println(MyParent2.str);
    }

}

class MyParent2{

    public static final String str ="hello world";
    static {
        System.out.println("MyParent2 static block");
    }
}