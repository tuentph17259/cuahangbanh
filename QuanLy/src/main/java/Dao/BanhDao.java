/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Helpers.DatabaseHelper;
import Model.Banh;
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
public class BanhDao {

    public boolean insert(Banh banh)
            throws Exception {
        String sql = "INSERT INTO [dbo].[Banh]([MaBanh],[TenBanh],[SizeBanh],[SoLuong],[GiaTien],[NgayNhap],[MaNhanVien])" + "values(?,?,?,?,?,?,?)";

        try (Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstm = con.prepareStatement(sql);) {
            pstm.setString(1, banh.getMaBanh());
            pstm.setString(2, banh.getTenBanh());
            pstm.setString(3, banh.getSizeBanh());
            pstm.setInt(4, banh.getSoLuong());
            pstm.setFloat(5, banh.getGiaTien());
            pstm.setString(6, banh.getNgayNhap());
            pstm.setString(7, banh.getMaNhanVien());

            return pstm.executeUpdate() > 0;
        }
    }

    public boolean update(Banh banh)
            throws Exception {

        /*String sql = "UPDATE [dbo].[Banh]"
                + "  SET [TenBanh] = ?, [SizeBanh] = ?,[SoLuong] =?, [GiaTien] = ?,[NgayNhap] = ?,[MaNhanVien]=?"
                + "where [MaBanh] = ?";*/
        String sql = "update Banh set TenBanh=?,SizeBanh=?,SoLuong=?,GiaTien=?,NgayNhap=?,MaNhanVien=? where MaBanh=?";
        try (Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstm = con.prepareStatement(sql);) {
            pstm.setString(7, banh.getMaBanh());
            pstm.setString(1, banh.getTenBanh());
            pstm.setString(2, banh.getSizeBanh());
            pstm.setInt(3, banh.getSoLuong());
            pstm.setFloat(4, banh.getGiaTien());
            pstm.setString(5, banh.getNgayNhap());
            pstm.setString(6, banh.getMaNhanVien());

            return pstm.executeUpdate() > 0;
        }
    }

    public boolean deleteByMaBanh(String maBanh)
            throws Exception {
        String sql = "delete from Banh where MaBanh=?";

        try (Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstm = con.prepareStatement(sql);) {
            pstm.setString(1, maBanh);

            return pstm.executeUpdate() > 0;
        }
    }

    ;
        public Banh findByIMaBanh(String maBanh)
            throws Exception {
        String sql = "select * from Banh where MaBanh=?";

        try (Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstm = con.prepareStatement(sql);) {
            pstm.setString(1, maBanh);
            try (ResultSet rs = pstm.executeQuery();) {
                if (rs.next()) {
                    Banh banh = new Banh();
                    banh.setMaBanh(rs.getString("MaBanh"));
                    banh.setTenBanh(rs.getString("TenBanh"));
                    banh.setSizeBanh(rs.getString("SizeBanh"));
                    banh.setSoLuong(rs.getInt("SoLuong"));
                    banh.setGiaTien(rs.getFloat("GiaTien"));
                    banh.setNgayNhap(rs.getString("NgayNhap"));
                    banh.setMaNhanVien(rs.getString("MaNhanVien"));

                    return banh;
                }
            }

            return null;
        }
    }

    public List<Banh> finadAll() throws Exception {
        String sql = "select * from Banh ";

        try (Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstm = con.prepareStatement(sql);) {
            try (ResultSet rs = pstm.executeQuery();) {
                List<Banh> list = new ArrayList<>();
                while (rs.next()) {
                    Banh banh = new Banh();
                    banh.setMaBanh(rs.getString("MaBanh"));
                    banh.setTenBanh(rs.getString("TenBanh"));
                    banh.setSizeBanh(rs.getString("SizeBanh"));
                    banh.setSoLuong(rs.getInt("SoLuong"));
                    banh.setGiaTien(rs.getFloat("GiaTien"));
                    banh.setNgayNhap(rs.getString("NgayNhap"));
                    banh.setMaNhanVien(rs.getString("MaNhanVien"));
                    list.add(banh);

                }
                return list;
            }

        }

    }

}
