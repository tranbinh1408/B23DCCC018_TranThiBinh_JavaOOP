package Bai_04;
abstract class Shape {
    // Phương thức trừu tượng tính chu vi
    public abstract double getPerimeter();

    // Phương thức trừu tượng tính diện tích
    public abstract double getArea();

    // Phương thức để hiển thị thông tin
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
        super.displayInfo();  // Gọi phương thức từ lớp cha
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
        super.displayInfo();  // Gọi phương thức từ lớp cha
    }
}

// Lớp Main để chạy chương trình
public class Bai_04 {
    public static void main(String[] args) {
        // Tạo đối tượng hình chữ nhật
        Shape rectangle = new Rectangle(5, 10);
        rectangle.displayInfo();

        System.out.println();

        // Tạo đối tượng hình tròn
        Shape circle = new Circle(7);
        circle.displayInfo();
    }
}


