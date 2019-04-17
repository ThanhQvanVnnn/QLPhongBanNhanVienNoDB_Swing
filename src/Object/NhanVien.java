
package Object;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author phung
 */
public class NhanVien {
    private int maNhanVien;
    private String tenNhanVien;
    private Boolean gioiTinh;
    private int soCMND;
    private Date ngayVaoLam;
    private float luongCoBan;
    private int soNgayLamViec;
    private ArrayList<String> soThich;
    private int maPhongBan;

    public NhanVien() {
    }

    public NhanVien(int maNhanVien, String tenNhanVien, Boolean gioiTinh, int soCMND, Date ngayVaoLam, float luongCoBan, int soNgayLamViec, ArrayList<String> soThich, int maPhongBan) {
        this.maNhanVien = maNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.gioiTinh = gioiTinh;
        this.soCMND = soCMND;
        this.ngayVaoLam = ngayVaoLam;
        this.luongCoBan = luongCoBan;
        this.soNgayLamViec = soNgayLamViec;
        this.soThich = soThich;
        this.maPhongBan = maPhongBan;
    }

    public Boolean getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(Boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    
    public int getMaNhanVien() {
        return maNhanVien;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public int getSoCMND() {
        return soCMND;
    }

    public Date getNgayVaoLam() {
        return ngayVaoLam;
    }

    public float getLuongCoBan() {
        return luongCoBan;
    }

    public int getSoNgayLamViec() {
        return soNgayLamViec;
    }

    public ArrayList<String> getSoThich() {
        return soThich;
    }

    public int getMaPhongBan() {
        return maPhongBan;
    }

    public void setMaNhanVien(int maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public void setSoCMND(int soCMND) {
        this.soCMND = soCMND;
    }

    public void setNgayVaoLam(Date ngayVaoLam) {
        this.ngayVaoLam = ngayVaoLam;
    }

    public void setSoNgayLamViec(int soNgayLamViec) {
        this.soNgayLamViec = soNgayLamViec;
    }

    public void setSoThich(ArrayList<String> soThich) {
        this.soThich = soThich;
    }

    public void setMaPhongBan(int maPhongBan) {
        this.maPhongBan = maPhongBan;
    }
    
    public String getGioiTinhString(){
        if(this.gioiTinh == true){
            return "Nam";
        }
        return "Nữ";
    }
    public String getSoThichString(){
       String soThich = "";
       for(String s:this.soThich){
           soThich += ","+ s ;
       }
       
       return soThich.substring(1);
    }

    public void setLuongCoBan(float luongCoBan) {
        this.luongCoBan = luongCoBan;
    }
    
}
