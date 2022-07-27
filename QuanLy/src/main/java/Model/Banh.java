/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author admin
 */
public class Banh {
    private String MaBanh;
    private String TenBanh;
    private String SizeBanh;
    private int SoLuong;
    private float GiaTien;
    private String NgayNhap;
     private String MaNhanVien;

    public Banh() {
    }

    public Banh(String MaBanh, String TenBanh, String SizeBanh, int SoLuong, float GiaTien, String NgayNhap, String MaNhanVien) {
        this.MaBanh = MaBanh;
        this.TenBanh = TenBanh;
        this.SizeBanh = SizeBanh;
        this.SoLuong = SoLuong;
        this.GiaTien = GiaTien;
        this.NgayNhap = NgayNhap;
        this.MaNhanVien = MaNhanVien;
    }

    public String getMaBanh() {
        return MaBanh;
    }

    public void setMaBanh(String MaBanh) {
        this.MaBanh = MaBanh;
    }

    public String getTenBanh() {
        return TenBanh;
    }

    public void setTenBanh(String TenBanh) {
        this.TenBanh = TenBanh;
    }

    public String getSizeBanh() {
        return SizeBanh;
    }

    public void setSizeBanh(String SizeBanh) {
        this.SizeBanh = SizeBanh;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public float getGiaTien() {
        return GiaTien;
    }

    public void setGiaTien(float GiaTien) {
        this.GiaTien = GiaTien;
    }

    public String getNgayNhap() {
        return NgayNhap;
    }

    public void setNgayNhap(String NgayNhap) {
        this.NgayNhap = NgayNhap;
    }

    public String getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(String MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

  
 
   
    
}
