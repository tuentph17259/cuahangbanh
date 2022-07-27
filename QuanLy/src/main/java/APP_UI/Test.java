/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package APP_UI;

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
   String url="jdbc:sqlserver://localhost:1433;databaseName=PoLy_App";
            //3. Connection
            
          Connection con = DriverManager.getConnection(url,"sa","123456789");

            System.out.println("conection is open");
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
