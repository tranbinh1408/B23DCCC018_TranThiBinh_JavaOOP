package Baithuchanh01;

import java.util.Scanner;

public class Baithuchanh01 {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để nhận input
        Scanner scanner = new Scanner(System.in);

        // Nhận vào hai số nguyên
        int length = scanner.nextInt();
        int width = scanner.nextInt();

        // Kiểm tra điều kiện hợp lệ
        if (length <= 0 || width <= 0 || length > 10000 || width > 10000) {
            // Nếu không hợp lệ, in ra 0
            System.out.println("0");
        } else {
            // Tính chu vi và diện tích
            int perimeter = 2 * (length + width);
            int area = length * width;
            // In chu vi và diện tích
            System.out.println(perimeter + " " + area);
        }

        // Đóng Scanner sau khi sử dụng
        scanner.close();
    }
}