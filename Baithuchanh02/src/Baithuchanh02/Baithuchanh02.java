package Baithuchanh02;

import java.util.Scanner; 

public class Baithuchanh02 {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để nhận input
        Scanner scanner = new Scanner(System.in);

        // Nhập số lượng bộ test
        int testCases = scanner.nextInt();

        // Duyệt qua từng bộ test
        for (int i = 0; i < testCases; i++) {
            // Nhập số nguyên N
            long N = scanner.nextLong();

            // Tính tổng S = 1 + 2 + ... + N theo công thức
            long sum = N * (N + 1) / 2;

            // In kết quả ra màn hình
            System.out.println(sum);
        }

        // Đóng Scanner sau khi sử dụng
        scanner.close();
    }


}
