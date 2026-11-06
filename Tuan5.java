import java.util.Scanner;

public class Tuan5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String ma[] = new String[100];
        String ten[] = new String[100];
        int sl[] = new int[100];
        double gia[] = new double[100];

        int n = 0;
        int chon;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Nhap n sach");
            System.out.println("2. Tinh tong so luong va tong gia tri sach");
            System.out.println("3. Tim sach theo ma");
            System.out.println("0. Thoat");
            System.out.print("Chon bai: ");
            chon = sc.nextInt();

            switch (chon) {
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

                case 0:
                    System.out.println("Thoat chuong trinh!");
                    break;

                default:
                    System.out.println("Chon sai!");
            }

        } while (chon != 0);

        sc.close();
    }
}