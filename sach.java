public class sach {
    public String masach;
    public  String tieude;
    public  String tacgia;
    public int namxuatban;
    public int soluong;
    public sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong) {
        this.masach = maSach;
        this.tieude = tieuDe;
        this.tacgia = tacGia;
        this.namxuatban = namXuatBan;
        this.soluong = soLuong;
    }
     public void hienThiThongTin() {
        System.out.println("Ma sach"+masach);
        System.out.println("Ten sach"+tieude);
        System.out.println("Tac gia"+tacgia);
        System.out.println("Nam xuat ban"+namxuatban);
        System.out.println("So luong"+soluong);
     }
}

