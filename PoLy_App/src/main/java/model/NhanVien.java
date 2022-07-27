/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author admin
 */
public class NhanVien {
    private String maNhanVien;
    private String tenNhanVien;
    private String tuoi;
    private String diaChi;
    private String sdt;
    private String queQuan;

    public NhanVien() {
    }

    public NhanVien(String maNhanVien, String tenNhanVien, String tuoi, String diaChi, String sdt, String queQuan) {
        this.maNhanVien = maNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.queQuan = queQuan;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public String getTuoi() {
        return tuoi;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    

    
        
}
