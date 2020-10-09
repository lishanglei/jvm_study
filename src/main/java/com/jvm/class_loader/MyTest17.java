package com.jvm.class_loader;

/**
 * @author lishanglei
 * @version v1.0.0
 * @date 2020/10/9
 * @Description Modification History:
 * Date                 Author          Version          Description
 * ---------------------------------------------------------------------------------*
 * 2020/10/9              lishanglei      v1.0.0           Created
 */
public class MyTest17 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        MyTest16 loader1 =new MyTest16("loader1");

        Class<?> clazz = loader1.loadClass("com.jvm.class_loader.MySample");
        System.out.println("class: "+clazz.hashCode());

        //该行会实例化MySample对象
        //Object object =clazz.newInstance();


    }


}
