package Bai_05;

import java.util.ArrayList;

// Lớp Shape với các phương thức trừu tượng
abstract class Shape {
    public abstract double getPerimeter();
    public abstract double getArea();

    public void displayInfo() {
        System.out.println("Chu vi: " + getPerimeter());
        System.out.println("Diện tích: " + getArea());
    }
}

// Lớp Rectangle kế thừa từ Shape
class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void displayInfo() {
        System.out.println("Hình chữ nhật:");
        super.displayInfo();
    }
}

// Lớp Circle kế thừa từ Shape
class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void displayInfo() {
        System.out.println("Hình tròn:");
        super.displayInfo();
    }
}

// Lớp chính để chạy chương trình
public class Bai_05 {
    public static void main(String[] args) {
        // Tạo danh sách chứa các đối tượng Shape
        ArrayList<Shape> shapes = new ArrayList<>();
        
        // Thêm các đối tượng hình chữ nhật và hình tròn vào danh sách
        shapes.add(new Rectangle(5, 10));
        shapes.add(new Circle(7));
        shapes.add(new Rectangle(3, 6));
        shapes.add(new Circle(4));

        // Tính tổng diện tích và chu vi
        double totalArea = 0;
        double totalPerimeter = 0;

        for (Shape shape : shapes) {
            totalArea += shape.getArea();
            totalPerimeter += shape.getPerimeter();
        }

        // Hiển thị tổng diện tích và chu vi
        System.out.println("Tổng diện tích của tất cả các hình: " + totalArea);
        System.out.println("Tổng chu vi của tất cả các hình: " + totalPerimeter);
    }
}
