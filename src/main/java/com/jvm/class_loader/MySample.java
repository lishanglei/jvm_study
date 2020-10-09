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
public class MySample {

    public MySample() {
        System.out.println("MySample is loaded by :" +this.getClass().getClassLoader());

        //实例化MyCat对象前会先加载MyCat,会使用加载MySample类的类加载器进行加载
        new MyCat();
        System.out.println("from MySample :" +MyCat.class);
    }
}
