package Baithuchanh03;

import java.util.Scanner;

public class Baithuchanh03 {
    static int N, K;
    static int[] combination;
    static int count = 0; // Đếm số tổ hợp

    // Hàm backtracking để liệt kê tổ hợp
    public static void generateCombinations(int index, int start) {
        // Khi đủ K phần tử, in tổ hợp
        if (index == K) {
            for (int i = 0; i < K; i++) {
                System.out.print(combination[i] + " ");
            }
            System.out.println();
            count++;
            return;
        }

        // Sinh các phần tử từ `start` đến `N`
        for (int i = start; i <= N; i++) {
            combination[index] = i;
            generateCombinations(index + 1, i + 1);
        }
    }

    public static void main(String[] args) {
        // Nhập dữ liệu
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        K = scanner.nextInt();

        // Kiểm tra điều kiện 2 < K < N < 10
        if (K <= 2 || K >= N || N >= 10) {
            System.out.println("Invalid input");
            scanner.close();
            return;
        }

        // Khởi tạo mảng để lưu tổ hợp
        combination = new int[K];

        // Gọi hàm backtracking bắt đầu từ vị trí 0
        generateCombinations(0, 1);

        // In ra tổng số tổ hợp
        System.out.println("Tong cong co " + count + " to hop");

        // Đóng Scanner sau khi sử dụng
        scanner.close();
    }
}
