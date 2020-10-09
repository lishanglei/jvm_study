package com.jvm.class_loader;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

/**
 * @author lishanglei
 * @version v1.0.0
 * @date 2020/9/30
 * @Description Modification History:
 * Date                 Author          Version          Description
 * ---------------------------------------------------------------------------------*
 * 2020/9/30              lishanglei      v1.0.0           Created
 */
public class MyTest14 {

    public static void main(String[] args) throws IOException {
        ClassLoader classLoader =Thread.currentThread().getContextClassLoader();
        System.out.println(classLoader);
        String resourceName ="com/jvm/class_loader/MyTest13.class";
        Enumeration<URL> urls =classLoader.getResources(resourceName);
       while (urls.hasMoreElements()){
           URL url = urls.nextElement();
           System.out.println(url);
       }

        System.out.println("--------------");
        Class<MyTest14> myTest14Class = MyTest14.class;
        System.out.println(myTest14Class.getClassLoader());
        System.out.println("--------------");
        System.out.println(String.class.getClassLoader());
    }
}
