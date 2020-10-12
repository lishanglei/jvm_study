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
public class MyTest18 {

    public static void main(String[] args) {

        System.out.println("根类加载器加载路径: "+System.getProperty("sun.boot.class.path"));
        System.out.println("拓展类加载器加载路径: "+System.getProperty("java.ext.dirs"));
        System.out.println("系统类加载器加载路径: "+System.getProperty("java.class.path"));
    }
}
