package Baithuchanh05;
import java.util.Scanner;

class Rectange {
    private double width;
    private double height;
    private String color;

    // Constructor mặc định
    public Rectange() {
        this.width = 1;
        this.height = 1;
        this.color = "White";
    }

    // Constructor nhận các giá trị cụ thể
    public Rectange(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = formatColor(color);
    }

    // Getter và setter cho chiều rộng
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    // Getter và setter cho chiều dài
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Getter và setter cho màu sắc
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = formatColor(color);
    }

    // Phương thức tính diện tích
    public double findArea() {
        return this.width * this.height;
    }

    // Phương thức tính chu vi
    public double findPerimeter() {
        return 2 * (this.width + this.height);
    }

    // Phương thức chuẩn hóa chuỗi màu sắc (viết hoa ký tự đầu, các ký tự sau viết thường)
    private String formatColor(String color) {
        if (color == null || color.isEmpty()) {
            return "";
        }
        return color.substring(0, 1).toUpperCase() + color.substring(1).toLowerCase();
    }
}

public class Baithuchanh05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập độ dài hai cạnh và màu sắc
        double width = scanner.nextDouble();
        double height = scanner.nextDouble();
        String color = scanner.next();

        // Kiểm tra dữ liệu đầu vào có hợp lệ không (các cạnh phải là số nguyên dương)
        if (width <= 0 || height <= 0) {
            System.out.println("INVALID");
        } else {
            // Tạo đối tượng hình chữ nhật với dữ liệu nhập vào
            Rectange rect = new Rectange(width, height, color);

            // In ra chu vi, diện tích và màu sắc
            System.out.printf("%.0f %.0f %s\n", rect.findPerimeter(), rect.findArea(), rect.getColor());
        }

        scanner.close();
    }
}

