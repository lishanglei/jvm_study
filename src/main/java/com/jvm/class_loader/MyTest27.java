package com.jvm.class_loader;


import sun.reflect.Reflection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author lishanglei
 * @version v1.0.0
 * @date 2020/10/12
 * @Description Modification History:
 * Date                 Author          Version          Description
 * ---------------------------------------------------------------------------------*
 * 2020/10/12              lishanglei      v1.0.0           Created
 */
public class MyTest27 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        System.out.println(System.getProperty("jdbc.drivers"));
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mytestdb","username","password");
    }
}
