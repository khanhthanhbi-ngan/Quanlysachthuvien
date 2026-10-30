import java.util.Scanner;

public class Quanlysachthuvien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String masach, tensach, tacgia;
        int namxuatban, soluong;
        double dongia, thanhtien, phivanchuyen, tongtien;

        // Bai 1: Nhap thong tin sach
        System.out.print("Nhap ma sach: ");
        masach = sc.nextLine();

        System.out.print("Nhap ten sach: ");
        tensach = sc.nextLine();

        System.out.print("Nhap tac gia: ");
        tacgia = sc.nextLine();

        System.out.print("Nhap nam xuat ban: ");
        namxuatban = sc.nextInt();

        System.out.print("Nhap don gia: ");
        dongia = sc.nextDouble();

        System.out.print("Nhap so luong: ");
        soluong = sc.nextInt();

        // Hien thi thong tin sach
        System.out.println("\n===== THONG TIN SACH =====");
        System.out.println("Ma sach: " + masach);
        System.out.println("Ten sach: " + tensach);
        System.out.println("Tac gia: " + tacgia);
        System.out.println("Nam xuat ban: " + namxuatban);
        System.out.println("Don gia: " + dongia);
        System.out.println("So luong: " + soluong);

        // Bai 2: Tinh thanh tien
        thanhtien = dongia*soluong;
        System.out.println("thanh tien: " +thanhtien);
        //bai3 tinh phi van chuyen
        phivanchuyen = thanhtien * 0.05;
        System.out.println("phi van chuyen: "+phivanchuyen);
        //bai4 tinh tong tien
        tongtien = thanhtien +phivanchuyen;
        System.out.println("tong tien: "+tongtien);
}
}