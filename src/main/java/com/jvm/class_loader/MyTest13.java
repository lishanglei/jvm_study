package com.jvm.class_loader;

import javax.sound.midi.Soundbank;

/**
 * @author lishanglei
 * @version v1.0.0
 * @date 2020/9/30
 * @Description Modification History:
 * Date                 Author          Version          Description
 * ---------------------------------------------------------------------------------*
 * 2020/9/30              lishanglei      v1.0.0           Created
 */
public class MyTest13 {

    public static void main(String[] args) {
        ClassLoader classLoader =ClassLoader.getSystemClassLoader();
        System.out.println(classLoader);
        while(null != classLoader){
            classLoader =classLoader.getParent();
            System.out.println(classLoader);
        }
    }
}
