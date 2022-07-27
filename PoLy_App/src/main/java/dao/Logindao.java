/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import helper.DataHelper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Login;

/**
 *
 * @author DELL
 */
public class Logindao {

    public Login checkLogin(String username, String password)
            throws Exception {
        String sql = "select username, password from login" + " where tendangnhap=? and matkhau=?";

        try (Connection con = DataHelper.openConnection();
             PreparedStatement pstm = con.prepareStatement(sql);) {
            pstm.setString(1, username);
            pstm.setString(2, password);
            try(ResultSet rs =pstm.executeQuery()){
                 if(rs.next()){
                     Login lg = new Login();
                     lg.setUsername(username);
                     return lg;
                 }
             }
        }
        return null;
    }
}
