/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author DELL
 */
public class DataHelper {
    public static Connection openConnection() throws Exception{
        Class.forName("com.microsoft.sqlserver.jbdc.SQLserverDriver");
        String connectionUr = "jbdc:sqlserver://localhost;database=PolyApp;";
        String username = "demo";
        String password = "demo";
        Connection con = DriverManager.getConnection(connectionUr, username, password);
        return con;
    }
}
