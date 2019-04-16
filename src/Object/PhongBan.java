/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object;

import java.util.ArrayList;

/**
 *
 * @author phung
 */
public class PhongBan {
    private int maPhongBan;
    private String tenPhongBan;
    private ArrayList<NhanVien> dsNhanVien;

    public PhongBan(String tenPhongBan, ArrayList<NhanVien> dsNhanVien) {
        this.tenPhongBan = tenPhongBan;
        this.dsNhanVien = dsNhanVien;
    }

    public PhongBan(int maPhongBan, String tenPhongBan, ArrayList<NhanVien> dsNhanVien) {
        this.maPhongBan = maPhongBan;
        this.tenPhongBan = tenPhongBan;
        this.dsNhanVien = dsNhanVien;
    }

    
    public PhongBan() {
    }

    public int getMaPhongBan() {
        return maPhongBan;
    }

    public String getTenPhongBan() {
        return tenPhongBan;
    }

    public ArrayList<NhanVien> getDsNhanVien() {
        return dsNhanVien;
    }

    public void setMaPhongBan(int maPhongBan) {
        this.maPhongBan = maPhongBan;
    }

    public void setTenPhongBan(String tenPhongBan) {
        this.tenPhongBan = tenPhongBan;
    }

    public void setDsNhanVien(ArrayList<NhanVien> dsNhanVien) {
        this.dsNhanVien = dsNhanVien;
    }
    
}
