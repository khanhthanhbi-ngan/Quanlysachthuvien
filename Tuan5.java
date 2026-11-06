import java.util.ArrayList;
import java.util.Scanner;

public class Tuan5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Dữ liệu Tuần 5
        String ma[] = new String[100];
        String ten[] = new String[100];
        int sl[] = new int[100];
        double gia[] = new double[100];

        int n = 0;
        // --- Dữ liệu Tuần 6 - Bài 2 (ArrayList mã sách) ---
        ArrayList<String> dsMaSach = new ArrayList<>();

        // --- Dữ liệu Tuần 6 - Bài 3 & 4 (Các ArrayList quản lý thông tin sách) ---
        ArrayList<String> listMa = new ArrayList<>();
        ArrayList<String> listTen = new ArrayList<>();
        ArrayList<Integer> listSl = new ArrayList<>();
        ArrayList<Double> listGia = new ArrayList<>();
        int chon;

        do {
            System.out.println("\n===== MENU QUAN LY SACH =====");
            System.out.println("1. Tuan 5 - Nhap n sach");
            System.out.println("2. Tuan 5 - Tinh tong so luong va tong gia tri");
            System.out.println("3. Tuan 5 - Tim sach theo ma");

            System.out.println("4. Tuan 6 - Mang so luong 5 cuon sach");

            System.out.println("5. Tuan 6 - Them ma sach");
            System.out.println("6. Tuan 6 - Hien thi ma sach");
            System.out.println("7. Tuan 6 - Tim ma sach");
            System.out.println("8. Tuan 6 - Xoa ma sach");

            System.out.println("9. Tuan 6 - Them sach");
            System.out.println("10. Tuan 6 - Hien thi sach");
            System.out.println("11. Tuan 6 - Tim sach");
            System.out.println("12. Tuan 6 - Xoa sach");
            System.out.println("13. Tuan 6 - Sua sach");
            System.out.println("14. Tuan 6 - Tinh tong so luong sach");
            System.out.println("15. Tuan 6 - Tinh tong gia tri sach");

            System.out.println("0. Thoat");
            System.out.print("Chon bai: ");
            chon = sc.nextInt();
        

            switch (chon) {
                // TUẦN 5
                case 1: {
                    System.out.print("Nhap so sach: ");
                    n = sc.nextInt();

                    for (int i = 0; i < n; i++) {
                        sc.nextLine();

                        System.out.print("Ma sach: ");
                        ma[i] = sc.nextLine();

                        System.out.print("Ten sach: ");
                        ten[i] = sc.nextLine();

                        System.out.print("So luong: ");
                        sl[i] = sc.nextInt();

                        System.out.print("Don gia: ");
                        gia[i] = sc.nextDouble();
                    }
                    break;
                }

                case 2: {
                    int tongSL = 0;
                    double tongGT = 0;

                    for (int i = 0; i < n; i++) {
                        tongSL += sl[i];
                        tongGT += sl[i] * gia[i];
                    }

                    System.out.println("Tong so luong sach: " + tongSL);
                    System.out.println("Tong gia tri sach: " + tongGT);
                    break;
                }

                case 3: {
                    sc.nextLine();
                    System.out.print("Nhap ma sach can tim: ");
                    String tim = sc.nextLine();

                    boolean kt = false;

                    for (int i = 0; i < n; i++) {
                        if (ma[i].equalsIgnoreCase(tim)) {
                            System.out.println("Ma sach: " + ma[i]);
                            System.out.println("Ten sach: " + ten[i]);
                            System.out.println("So luong: " + sl[i]);
                            System.out.println("Don gia: " + gia[i]);
                            kt = true;
                        }
                    }

                    if (kt == false) {
                        System.out.println("Khong tim thay sach!");
                    }
                    break;
                }
               // ================= TUẦN 6 - BÀI 1 =================
                case 4: {
                    int soLuong5[] = new int[5]; // Dùng mảng riêng tránh ghi đè dữ liệu Tuần 5
                    int tong = 0;

                    for (int i = 0; i < 5; i++) {
                        System.out.print("Nhap so luong sach thu " + (i + 1) + ": ");
                        soLuong5[i] = sc.nextInt();
                    }

                    int max = soLuong5[0];
                    System.out.println("\nSo luong 5 cuon sach:");

                    for (int i = 0; i < 5; i++) {
                        System.out.println(soLuong5[i]);
                        tong += soLuong5[i];
                        if (soLuong5[i] > max) {
                            max = soLuong5[i];
                        }
                    }

                    System.out.println("Tong so luong: " + tong);
                    System.out.println("So luong lon nhat: " + max);
                    break;
                }
                //              TUẦN 6 BÀI 2
                case 5:{
                    sc.nextLine();
                    System.out.println("nhap ma sach:");
                    dsMaSach.add(sc.nextLine());
                    System.out.println("them sach thanh cong!");
                    break;
                }
                case 6:{
                    System.out.println("Dach sach ma sach:");
                    if(dsMaSach.isEmpty())
                        System.out.println("Danh sach trong!");
                    else
                    {
                        for(int i=0;i < dsMaSach.size(); i++)
                            System.out.println(dsMaSach.get(i));
                    }
                    break;
                }
                case 7:
                    {
                        sc.nextLine();
                        System.out.println("Nhap ma sach can tim");
                        String tim = sc.nextLine();
                        if(dsMaSach.contains(tim))
                            System.out.println("Tim thay ma sach'"+tim+"'tai vi tri:"+(dsMaSach.indexOf(tim)+1));
                        else
                            System.out.println("khong tim thay ma sach!");
                        break;
                    }
                    case 8:{
                        sc.nextLine();
                        System.out.println("nhap ma sach can xoa:");
                        String xoa = sc.nextLine();
                        if(dsMaSach.remove(xoa))
                            System.out.println("Xoa ma sach thanh cong!");
                        else
                            System.out.println("khong tim thay ma sach de xoa!");
                        break;
                    }
                    //      TUẦN 6 BAI 3 & 4
                    case 9:{
                        sc.nextLine();
                        System.out.println("Nhap ma sach");
                        listMa.add(sc.nextLine());
                        System.out.println("Nhap ten sach");
                        listTen.add(sc.nextLine());
                        System.out.println("Nhap so luong sach");
                        listSl.add(sc.nextInt());
                        System.out.println("Nhap don gia sach");
                        listGia.add(sc.nextDouble());
                        System.out.println("them sach thanh cong!");
                        break;
                    }
                    case 10: { // Hien thi sach
                    System.out.println("\nDanh sach sach:");
                    if (listMa.isEmpty()) {
                        System.out.println("Danh sach trong!");
                    } else {
                        for (int i = 0; i < listMa.size(); i++) {
                            System.out.println("Ma: " + listMa.get(i) + " | Ten: " + listTen.get(i)
                                    + " | So luong: " + listSl.get(i) + " | Don gia: " + listGia.get(i)
                                    + " | Thanh tien: " + (listSl.get(i) * listGia.get(i)));
                        }
                    }
                    break;
                }
                case 11: { // Tim sach
                    sc.nextLine();
                    System.out.print("Nhap ma sach can tim: ");
                    String tim = sc.nextLine();
                    boolean timThay = false;

                    for (int i = 0; i < listMa.size(); i++) {
                        if (listMa.get(i).equalsIgnoreCase(tim)) {
                            System.out.println("--- Ket qua tim thay ---");
                            System.out.println("Ma: " + listMa.get(i));
                            System.out.println("Ten: " + listTen.get(i));
                            System.out.println("So luong: " + listSl.get(i));
                            System.out.println("Don gia: " + listGia.get(i));
                            timThay = true;
                            break;
                        }
                    }
                    if (!timThay) {
                        System.out.println("Khong tim thay sach!");
                    }
                    break;
                }

                case 12: { // Xoa sach
                    sc.nextLine();
                    System.out.print("Nhap ma sach can xoa: ");
                    String xoa = sc.nextLine();
                    int viTri = -1;

                    for (int i = 0; i < listMa.size(); i++) {
                        if (listMa.get(i).equalsIgnoreCase(xoa)) {
                            viTri = i;
                            break;
                        }
                    }

                    if (viTri != -1) {
                        listMa.remove(viTri);
                        listTen.remove(viTri);
                        listSl.remove(viTri);
                        listGia.remove(viTri);
                        System.out.println("Da xoa sach thanh cong!");
                    } else {
                        System.out.println("Khong tim thay sach can xoa!");
                    }
                    break;
                }

                case 13: { // Sua sach
                    sc.nextLine();
                    System.out.print("Nhap ma sach can sua: ");
                    String sua = sc.nextLine();
                    int viTri = -1;

                    for (int i = 0; i < listMa.size(); i++) {
                        if (listMa.get(i).equalsIgnoreCase(sua)) {
                            viTri = i;
                            break;
                        }
                    }

                    if (viTri != -1) {
                        System.out.println("Nhap lai thong tin moi:");
                        System.out.print("Ten sach moi: ");
                        listTen.set(viTri, sc.nextLine());

                        System.out.print("So luong moi: ");
                        listSl.set(viTri, sc.nextInt());

                        System.out.print("Don gia moi: ");
                        listGia.set(viTri, sc.nextDouble());

                        System.out.println("Sua thong tin sach thanh cong!");
                    } else {
                        System.out.println("Khong tim thay sach can sua!");
                    }
                    break;
                }

                case 14: { // Tong so luong sach
                    int tongSL = 0;
                    for (int soLuong : listSl) {
                        tongSL += soLuong;
                    }
                    System.out.println("Tong so luong sach: " + tongSL);
                    break;
                }

                case 15: { // Tong gia tri sach
                    double tongGT = 0;
                    for (int i = 0; i < listMa.size(); i++) {
                        tongGT += listSl.get(i) * listGia.get(i);
                    }
                    System.out.println("Tong gia tri sach: " + tongGT);
                    break;
                }
                case 0:{
                    System.out.println("Thoat chuong trinh!");
                    break;
                }
                default:
                    System.out.println("Chon sai!");
            }

        } while (chon != 0);

        sc.close();
    }
}