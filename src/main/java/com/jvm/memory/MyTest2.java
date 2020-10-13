package com.jvm.memory;

/**
 * 虚拟机栈溢出 stack over flow
 * @author lishanglei
 * @version v1.0.0
 * @date 2020/10/13
 * @Description Modification History:
 * Date                 Author          Version          Description
 * ---------------------------------------------------------------------------------*
 * 2020/10/13              lishanglei      v1.0.0           Created
 */
public class MyTest2 {

    private int length;

    public int getLength() {
        return length;
    }

    public void test(){
        length++;
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        test();
    }

    public static void main(String[] args) {

        MyTest2 myTest2 =new MyTest2();
        try {

            myTest2.test();
        } catch (Throwable e) {
            System.out.println(myTest2.getLength());
            e.printStackTrace();
        } finally {
        }
    }
}
