package com.jvm.memory;

import java.util.ArrayList;
import java.util.List;

/**
 * -Xms5m -Xmx5m -XX:+HeapDumpOnOutOfMemoryError
 * @author lishanglei
 * @version v1.0.0
 * @date 2020/10/12
 * @Description Modification History:
 * Date                 Author          Version          Description
 * ---------------------------------------------------------------------------------*
 * 2020/10/12              lishanglei      v1.0.0           Created
 */
public class MyTest1 {

    public static void main(String[] args) {

        List<MyTest1> list =new ArrayList<MyTest1>();
        for(;;){
            list.add(new MyTest1());
            System.gc();
        }

    }
}
