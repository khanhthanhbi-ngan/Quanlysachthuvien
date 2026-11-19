import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Sach> dsSach = new ArrayList<>();

        int chon;

        do {
            System.out.println("\n===== QUAN LY SACH =====");
            System.out.println("1. Them sach");
            System.out.println("2. Hien thi danh sach sach");
            System.out.println("3. Tim sach theo ma");
            System.out.println("4. Xoa sach theo ma");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");
            chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1: {
                    String maSach, tieuDe, tacGia;
                    int namXuatBan, soLuong;

                    System.out.print("Nhap ma sach: ");
                    maSach = sc.nextLine();

                    System.out.print("Nhap tieu de: ");
                    tieuDe = sc.nextLine();

                    System.out.print("Nhap tac gia: ");
                    tacGia = sc.nextLine();

                    System.out.print("Nhap nam xuat ban: ");
                    namXuatBan = sc.nextInt();
                    System.out.println("Nhap so luong sach: ");
                    soLuong =sc.nextInt();
                    sc.nextLine();
                    Sach s = new Sach(maSach, tieuDe, tacGia, namXuatBan, soLuong);
                    dsSach.add(s);
                    System.out.println("Them sach thanh cong!");
                    break;
                }
                case 2:{
                    if(dsSach.isEmpty())
                        System.out.println("Danh sach sach rong!");
                    else{
                        for(Sach s: dsSach){
                            s.hienThiThongTin();
                            System.out.println("...............");
                        }
                    }
                    break;
                }
                case 3:{
                    String ma;
                    boolean timthay = false;
                    System.out.println("Nhap man sach can tim: ");
                    ma = sc.nextLine();
                    for(Sach s : dsSach){
                        if(s.getMaSach().equals(ma)){
                            s.hienThiThongTin();
                            timthay = true;
                        }
                    }
                    if(!timthay)
                        System.out.println("Khong tim thay sach!");
                    break;
                }
                case 4:{
                    String ma;
                    boolean daxoa = false;
                    System.out.println("Nhap ma sach can xoa: ");
                    ma = sc.nextLine();
                    for(int i=0 ; i<dsSach.size(); i++){
                        if(dsSach.get(i).getMaSach().equals(ma)){
                            dsSach.remove(i);
                            daxoa =true;
                            break;
                        }
                    }
                    if(daxoa)
                        System.out.println("Xoa sach thanh cong!");
                    else
                        System.out.println("Khong tim thay sach!");
                    break;
                }
                case 0:{
                    System.out.println("Ket thuc chuong trinh");
                    break;
                }
                default:
                    System.out.println("Lua chon khong hop le:");
                }
            }while (chon != 0);

        sc.close();
    }
}
