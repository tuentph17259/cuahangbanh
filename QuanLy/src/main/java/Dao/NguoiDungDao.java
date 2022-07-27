/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Helpers.DatabaseHelper;
import Model.NguoiDung;
import java.sql.*;

/**
 *
 * @author admin
 */
public class NguoiDungDao {

    public NguoiDung checkLogin(String tenDangNhap, String matKhau)
            throws Exception {

        String sql = "select TenDangNhap, MatKhau from NguoiDung"
                + " where TenDangNhap =? and MatKhau =? ";
      
        try (Connection con = DatabaseHelper.openConnection();
             PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(1,tenDangNhap);
            pstmt.setString(2, matKhau);
            try(ResultSet rs =pstmt.executeQuery()){
                 if(rs.next()){
                     NguoiDung nd = new NguoiDung();
                     nd.setTenDangNhap(tenDangNhap);
                     //nd.setVaiTro(rs.getString("vaitro"));
                     return nd;
                 }
             }
        }
        return null;
    }
}

