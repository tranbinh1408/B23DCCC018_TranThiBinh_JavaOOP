package Bai_02;

public class Bai_02 {
    public static class Rectangle {

        private int width;
        private int height;

        public Rectangle(int width, int height) {
            this.width = width;
            this.height = height;
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

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        
        rectangle.displayInfo();
    }
}
