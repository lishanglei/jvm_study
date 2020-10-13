package com.jvm.memory;

/**
 * 线程死锁
 * @author lishanglei
 * @version v1.0.0
 * @date 2020/10/13
 * @Description Modification History:
 * Date                 Author          Version          Description
 * ---------------------------------------------------------------------------------*
 * 2020/10/13              lishanglei      v1.0.0           Created
 */
public class MyTest3 {

    public static void main(String[] args) {
        Thread threadA =new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    A.method();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"Thread-A");
        Thread threadB =new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    B.method();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"Thread-B");
        threadA.start();
        threadB.start();
    }
}


class A{

    public static synchronized void method() throws InterruptedException {
        System.out.println("method from A");
        Thread.sleep(5000);
        B.method();
    }
}

class B{

    public static synchronized void method() throws InterruptedException {
        System.out.println("method from B");
        Thread.sleep(5000);
        A.method();
    }
}