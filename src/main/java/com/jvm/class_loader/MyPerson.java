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
public class MyPerson {

    private MyPerson myPerson;

    public void setMyPerson(Object myPerson) {
        this.myPerson =(MyPerson) myPerson;
    }
}
