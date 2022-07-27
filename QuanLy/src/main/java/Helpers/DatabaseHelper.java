/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helpers;


import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author admin
 */
public class DatabaseHelper {
     public static Connection openConnection() throws Exception{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//        
//           String url="jdbc:sqlserver://localhost\\DESKTOP-NKFKLSL\\SQLEXPRESS:1433;databaseName=PoLy_App";
//          Connection con = DriverManager.getConnection(url,"sa","123456789");
        
        
        String connectionUr = "jdbc:sqlserver://localhost\\DESKTOP-NKFKLSL\\SQLEXPRESS:1433;databaseName=PoLy_App";
        String username = "sa";
       String password = "123456789";
        Connection con = DriverManager.getConnection(connectionUr, username, password);
        return con;
    }
}
