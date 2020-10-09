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
public class MyCat {

    public MyCat() {
        System.out.println("MyCat is loaded by :" +this.getClass().getClassLoader());

        //System.out.println("from MyCat: "+MySample.class);
    }
}
