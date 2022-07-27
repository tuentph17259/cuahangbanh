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
import model.NhanVien;

/**
 *
 * @author admin
 */
public class NhanVienDao {
     public boolean insert(NhanVien nv)
            throws Exception {
        String sql = "INSERT INTO [dbo].[NhanVien]([maSinhVien],[tenNhanVien], [tuoi],[diaChi],[sdt],[queQuan])" + "values(?,?,?,?,?,?)";

        try (Connection con = DataHelper.openConnection();
             PreparedStatement pstm = con.prepareStatement(sql);) {
            pstm.setString(1,nv.getMaNhanVien());
            pstm.setString(2,nv.getTenNhanVien());
            pstm.setString(3,nv.getTuoi());
            pstm.setString(4,nv.getDiaChi());
            pstm.setString(5,nv.getSdt());
            pstm.setString(6,nv.getQueQuan());
              
                return pstm.executeUpdate()>0;
    }  
}
     
   public boolean update(NhanVien nv)
            throws Exception {
        String sql = "UPDATE [dbo].[NhanVien]([maSinhVien],[tenNhanVien], [tuoi],[diaChi],[sdt],[queQuan])" + "values(?,?,?,?,?,?)";

        try (Connection con = DataHelper.openConnection();
             PreparedStatement pstm = con.prepareStatement(sql);) {
            pstm.setString(1,nv.getMaNhanVien());
            pstm.setString(2,nv.getTenNhanVien());
            pstm.setString(3,nv.getTuoi());
            pstm.setString(4,nv.getDiaChi());
            pstm.setString(5,nv.getSdt());
            pstm.setString(6,nv.getQueQuan());
              
                return pstm.executeUpdate()>0;
    }  
}

     public boolean delete(String maNhanVien)
            throws Exception {
        String sql = "delete from sinhvien" + "where MaSinhVien";

        try (Connection con = DataHelper.openConnection();
             PreparedStatement pstm = con.prepareStatement(sql);) {
            pstm.setString(1,maNhanVien);
          
                return pstm.executeUpdate()>0;
    }  
}
}