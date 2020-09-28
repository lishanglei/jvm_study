package com.jvm.class_loader;

/**
 *
 * 对于数组实例来说,其类型是有jvm在运行期动态生成的,表示为[Lcom.jvm.class_loader.MyParent4;
 * 动态生成的类型,其父类都是java.lang.Object
 *
 * 助记符:
 * anewarray: 表示创建一个引用类型的(如类,接口,数组)数组,并将其引用值压入栈顶
 * newarray: 表示创建一个指定的原始类型(如int,float,char)的数组,并将其引用值压入栈顶
 * @author lishanglei
 * @version v1.0.0
 * @date 2020/9/28
 * @Description Modification History:
 * Date                 Author          Version          Description
 * ---------------------------------------------------------------------------------*
 * 2020/9/28              lishanglei      v1.0.0           Created
 */
public class MyTest4 {

    public static void main(String[] args) {
        //MyParent4 myParent4 =new MyParent4();
        MyParent4[] myParent4s =new MyParent4[1];
        System.out.println(myParent4s.getClass());
        MyParent4[][] myParent4s1 =new MyParent4[1][1];
        System.out.println(myParent4s1.getClass());
        System.out.println(myParent4s.getClass().getSuperclass());
        System.out.println(myParent4s1.getClass().getSuperclass());
        int[] ints =new int[2];
        System.out.println(ints.getClass());
        System.out.println(ints.getClass().getSuperclass());
    }
}

class MyParent4{
    static {
        System.out.println("MyParent4 static block");
    }
}
