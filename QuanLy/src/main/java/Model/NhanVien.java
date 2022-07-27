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
public class NhanVien {

    private String MaNhanVien;
    private String HoTen;
    private int Tuoi;
    private String DiaChi;
    private String Sdt;
    private String QueQuan;

    public NhanVien() {
    }

    public NhanVien(String MaNhanVien, String HoTen, int Tuoi, String DiaChi, String Sdt, String QueQuan) {
        this.MaNhanVien = MaNhanVien;
        this.HoTen = HoTen;
        this.Tuoi = Tuoi;
        this.DiaChi = DiaChi;
        this.Sdt = Sdt;
        this.QueQuan = QueQuan;
    }

    public String getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(String MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int Tuoi) {
        this.Tuoi = Tuoi;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getSdt() {
        return Sdt;
    }

    public void setSdt(String Sdt) {
        this.Sdt = Sdt;
    }

    public String getQueQuan() {
        return QueQuan;
    }

    public void setQueQuan(String QueQuan) {
        this.QueQuan = QueQuan;
    }


    
    
}
