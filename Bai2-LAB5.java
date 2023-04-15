import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> danhSach = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int choice;
        do {
            System.out.println("1. Nhập danh sách họ và tên");
            System.out.println("2. Xuất danh sách vừa nhập");
            System.out.println("3. Xuất danh sách ngẫu nhiên");
            System.out.println("4. Sắp xếp giảm dần và xuất danh sách");
            System.out.println("5. Tìm và xóa họ tên nhập từ bàn phím");
            System.out.println("6. Kết thúc");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nhập số lượng họ tên: ");
                    int n = scanner.nextInt();
                    scanner.nextLine(); // đọc bỏ kí tự \n
                    for (int i = 0; i < n; i++) {
                        System.out.print("Nhập họ tên thứ " + (i+1) + ": ");
                        String hoTen = scanner.nextLine();
                        danhSach.add(hoTen);
                    }
                    break;
                case 2:
                    System.out.println("Danh sách họ tên:");
                    for (String hoTen : danhSach) {
                        System.out.println(hoTen);
                    }
                    break;
                case 3:
                    System.out.println("Danh sách họ tên ngẫu nhiên:");
                    Collections.shuffle(danhSach, random);
                    for (String hoTen : danhSach) {
                        System.out.println(hoTen);
                    }
                    break;
                case 4:
                    System.out.println("Danh sách họ tên đã sắp xếp giảm dần:");
                    Collections.sort(danhSach, Collections.reverseOrder());
                    for (String hoTen : danhSach) {
                        System.out.println(hoTen);
                    }
                    break;
                case 5:
                    scanner.nextLine(); // đọc bỏ kí tự \n
                    System.out.print("Nhập họ tên cần xóa: ");
                    String hoTenCanXoa = scanner.nextLine();
                    if (danhSach.remove(hoTenCanXoa)) {
                        System.out.println("Đã xóa " + hoTenCanXoa);
                    } else {
                        System.out.println("Không tìm thấy " + hoTenCanXoa + " để xóa");
                    }
                    break;
                case 6:
                    System.out.println("Kết thúc chương trình");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }

            System.out.println();
        } while (choice != 6);
    }
