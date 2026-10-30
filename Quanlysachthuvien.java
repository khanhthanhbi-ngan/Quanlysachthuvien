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

        int loaisach;

        // Bai 1: Kiem tra du lieu
        

        if (dongia <= 0) {
            System.out.println("Don gia khong hop le");
        } else if (soluong < 0) {
            System.out.println("So luong khong hop le");
        } else if (namxuatban <= 0 || namxuatban > 2026) {
            System.out.println("Nam xuat ban khong hop le");
        } else {
            System.out.println("Thong tin hop le");
        }
        //bai2
        if(dongia <=0)
            System.out.println("khong the phan loai don gia");
        else if (dongia < 50000) {
            System.out.println("Sach gia thap");
        } else if (dongia <= 100000) {
            System.out.println("Sach gia trung binh");
        } else if (dongia <= 200000) {
            System.out.println("Sach gia cao");
        } else if (dongia < 50000) {
            System.out.println("Sach gia thap");
        } else if (dongia <= 100000) {
            System.out.println("Sach gia trung binh");
        } else if (dongia <= 200000) {
            System.out.println("Sach gia cao");
        } else {
            System.out.println("sach gia dac biet");
        }
        //bai3
        if(soluong <0){
            System.out.println("so luong khong hop le");
        } else if (soluong == 0) {
            System.out.println("het sach");            
        } else if (soluong <=5) {
            System.out.println("sap het");            
        } else if (soluong <20) {
            System.out.println("con it");            
        } else{
            System.out.println("con nhieu");
        }
        // Bai 4: Chon loai sach
        System.out.println("\n===== CHON LOAI SACH =====");
        System.out.println("1. Sach giao khoa");
        System.out.println("2. Sach tham khao");
        System.out.println("3. Sach chuyen nganh");
        System.out.println("4. Sach khac");

        System.out.print("Nhap lua chon: ");
        loaisach = sc.nextInt();
        switch (loaisach) {
            case 1:
            System.out.println("sach giao khoa");                
                break;
            case 2:
                System.out.println("sach tham khao");
                break;
            case 3:
                System.out.println("sach chuyen nganh");
            case 4:
                System.out.println("sach khac");
                break;
            default:
                System.out.println("lua chon khong hop le");
                break;
}
}
}