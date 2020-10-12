package com.jvm.class_loader;

/**
 * @author lishanglei
 * @version v1.0.0
 * @date 2020/10/12
 * @Description Modification History:
 * Date                 Author          Version          Description
 * ---------------------------------------------------------------------------------*
 * 2020/10/12              lishanglei      v1.0.0           Created
 */
public class MyTest25 implements  Runnable {

    private Thread thread;

    public MyTest25() {
        this.thread =new Thread(this);
        thread.start();
    }

    public void run() {

        ClassLoader classLoader =this.thread.getContextClassLoader();
        this.thread.setContextClassLoader(classLoader);

        System.out.println("Class: "+classLoader.getClass());
        System.out.println("Parent: "+classLoader.getParent().getClass());

    }

    public static void main(String[] args) {
        new MyTest25();
    }
}
