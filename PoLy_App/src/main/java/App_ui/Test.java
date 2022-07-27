/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App_ui;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author admin
 */
public class Test {
    public static void main(String[] args) {
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
String connectionUrl = "jdbc:sqlserver://localhost;database=PolyApp";  
Connection con = DriverManager.getConnection(connectionUrl);  
String username = "sa";
String password = "123456789";


            System.out.println("conection is open");
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
