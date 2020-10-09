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
public class MyTest15 {

    public static void main(String[] args) {

        //根类加载器
        String[] strings =new String[2];
        System.out.println(strings.getClass().getClassLoader());
        System.out.println();

        //应用类加载器
        MyTest15[] myTest15s =new MyTest15[2];
        System.out.println(myTest15s.getClass().getClassLoader());


        System.out.println();
        //if the element type is a primitive type, then the array class has no * class loader.
        // 没有类加载器
        int[] ints =new int[2];
        int a =3;
        System.out.println(ints.getClass().getClassLoader());
    }
}
