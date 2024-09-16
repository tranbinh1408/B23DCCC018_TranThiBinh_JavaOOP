package Bai_03;

import Bai_03.Main.Circle;
import Bai_03.Main.Common;
import Bai_03.Main.Rectangle;

public class Bai_03 {
    public static class Common {
        public static boolean isPositive(int value) {
            return value > 0;
        }
}
    static class Rectangle {
        private int width;
        private int height;

        public Rectangle(int width, int height) {
            if (Common.isPositive(width) && Common.isPositive(height)) {
                this.width = width;
                this.height = height;
            } else {
                throw new IllegalArgumentException("Chiều rộng và chiều cao phải là số nguyên dương.");
            }
        }

        public int getPerimeter() {
            return 2 * (width + height);
        }

        public int getArea() {
            return width * height;
        }

        public void displayInfo() {
            System.out.println("Chiều rộng: " + width);
            System.out.println("Chiều cao: " + height);
            System.out.println("Chu vi: " + getPerimeter());
            System.out.println("Diện tích: " + getArea());
        }
    }

    // Lớp hình tròn
    static class Circle {
        private int radius;

        public Circle(int radius) {
            setRadius(radius); // Gọi setter để áp dụng kiểm tra
        }

        // Getter cho bán kính
        public int getRadius() {
            return radius;
        }

        // Setter với kiểm tra bán kính là số nguyên dương
        public void setRadius(int radius) {
            if (Common.isPositive(radius)) {
                this.radius = radius;
            } else {
                throw new IllegalArgumentException("Bán kính phải là số nguyên dương.");
            }
        }

        // Tính chu vi hình tròn
        public double getPerimeter() {
            return 2 * Math.PI * radius;
        }

        // Tính diện tích hình tròn
        public double getArea() {
            return Math.PI * radius * radius;
        }

        public void displayInfo() {
            System.out.println("Bán kính: " + radius);
            System.out.println("Chu vi: " + getPerimeter());
            System.out.println("Diện tích: " + getArea());
        }
    }

    public static void main(String[] args) {
        // Tạo đối tượng hình chữ nhật
        Rectangle rectangle = new Rectangle(5, 10);
        rectangle.displayInfo();

        System.out.println();

        // Tạo đối tượng hình tròn
        Circle circle = new Circle(7);
        circle.displayInfo();
    }
}