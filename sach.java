import java.time.Year;

import javax.naming.ldap.StartTlsRequest;

public class Sach {
    private String maSach;
    private  String tieuDe;
    private  String tacGia;
    private int namXuatBan;
    private int soLuong;
    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        setNamXuatBan(namXuatBan);
        setSoLuong(soLuong);
    }
    public  String getMaSach(){
        return  maSach;
    }
    public void  setMaSach(String maSach){
        this.maSach = maSach;
    }
    public String getTieuDe(){
        return  tieuDe;
    }
    public void setTieuDe(String tieuDe){
        this.tieuDe = tieuDe;
    }
    public String getTacGia(){
        return tacGia;
    }
    public  void setTacGia(String tacGia){
        this.tacGia = tacGia;
    }
    public  int getNamXuatBan(){
        return namXuatBan;
    }
    public void setNamXuatBan(int namXuatBan){
        int currentYear = Year.now().getValue();
        if(namXuatBan>0&& namXuatBan<=currentYear)
            this.namXuatBan=namXuatBan;
        else
            System.out.println("Loi: Nam xuat ban khong hop le (phai tu 1 den " + currentYear + ")!");
    }
    public int getSoLuong(){
        return soLuong;
    }
    public void setSoLuong(int soLuong){
        if(soLuong>=0)
            this.soLuong= soLuong;
        else
            System.out.println("Loi: So luong sach khong duoc am!");
    }
     public void hienThiThongTin() {
        System.out.println("Ma sach"+maSach);
        System.out.println("Ten sach"+tieuDe);
        System.out.println("Tac gia"+tacGia);
        System.out.println("Nam xuat ban"+namXuatBan);
        System.out.println("So luong"+soLuong);
     }
}

