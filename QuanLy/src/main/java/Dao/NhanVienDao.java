/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Helpers.DatabaseHelper;
import Model.NguoiDung;
import Model.NhanVien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class NhanVienDao {

    public boolean insert(NhanVien nv)
            throws Exception {
        String sql = "INSERT INTO [dbo].[NhanVien]([MaNhanVien],[HoTen],[Tuoi],[DiaChi],[Sdt],[QueQuan])" + "values(?,?,?,?,?,?)";

        try (Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstm = con.prepareStatement(sql);) {
            pstm.setString(1, nv.getMaNhanVien());
            pstm.setString(2, nv.getHoTen());
            pstm.setInt(3, nv.getTuoi());
            pstm.setString(4, nv.getDiaChi());
            pstm.setString(5, nv.getSdt());
            pstm.setString(6, nv.getQueQuan());

            return pstm.executeUpdate() > 0;
        }
    }

    ;
     
   public boolean update(NhanVien nv)
            throws Exception {

//        String sql = "UPDATE [dbo].[NhanVien]"
//                + "  SET [HoTen] = ?, [Tuoi] = ?,[DiaChi] =?, [Sdt] = ?,[QueQuan] = ?"
//                + "where [MaNhanVien] = ?";
        String sql = "update NhanVien set HoTen=?,Tuoi=?,DiaChi=?,Sdt=?,QueQuan=? where MaNhanVien=?";
        try (Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstm = con.prepareStatement(sql);) {
            pstm.setString(6, nv.getMaNhanVien());
            pstm.setString(1, nv.getHoTen());
            pstm.setInt(2, nv.getTuoi());
            pstm.setString(3, nv.getDiaChi());
            pstm.setString(4, nv.getSdt());
            pstm.setString(5, nv.getQueQuan());

            return pstm.executeUpdate() > 0;
        }
    }

    

     public boolean delete(String maNhanVien)
            throws Exception {
        String sql = "delete from NhanVien where MaNhanVien=?";

        try (Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstm = con.prepareStatement(sql);) {
            pstm.setString(1, maNhanVien);

            return pstm.executeUpdate() > 0;
        }
    }

    ;
        public NhanVien findById(String maNhanVien)
            throws Exception {
        String sql = "select * from NhanVien where MaNhanVien=?";

        try (Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstm = con.prepareStatement(sql);) {
            pstm.setString(1, maNhanVien);
            try (ResultSet rs = pstm.executeQuery();) {
                if (rs.next()) {
                    NhanVien nv = createNhanVien(rs);
                    return nv;
                }
            }

            return null;
        }
    }

    public List<NhanVien> finadAll() throws Exception {
        String sql = "select * from NhanVien ";

        try (Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstm = con.prepareStatement(sql);) {
            try (ResultSet rs = pstm.executeQuery();) {
                List<NhanVien> list = new ArrayList<>();
                while (rs.next()) {
                    NhanVien nv = createNhanVien(rs);
                    list.add(nv);
                }
                return list;
            }

        }
    }

    private NhanVien createNhanVien(final ResultSet rs) throws SQLException, NumberFormatException {
        NhanVien nv = new NhanVien();
        nv.setMaNhanVien(rs.getString("MaNhanVien"));
        nv.setHoTen(rs.getString("HoTen"));
        nv.setTuoi(rs.getInt("Tuoi"));
        nv.setDiaChi(rs.getString("DiaChi"));
        nv.setSdt(rs.getString("Sdt"));
        nv.setQueQuan(rs.getString("QueQuan"));
        return nv;
    }
}
