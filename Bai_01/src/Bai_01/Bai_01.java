package Bai_01;

public class Bai_01 {
	
	public static void main(String[] args) {
		if (args.length == 2) {
            try {      
                int width = Integer.parseInt(args[0]);
                int height = Integer.parseInt(args[1]);
                if (width >0 && height >0 ) {
                	int perimeter=2 * (width + height);
                	int area = width * height;
                	System.out.println("Chu vi hình chữ nhật:"+ perimeter);
                	System.out.println("Diện tích hình chữ nhật:"+ area);
                	
                } else {
                	System.out.println("Chiều dài, chiều rộng không là số nguyên dương");
                }
            }
	       catch(NumberFormatException e) {
	    	   System.out.println("Tham số không phải là số nguyên hợp lệ");
	       }
       }
       else {
    	   System.out.println("Vui lòng nhập 2 tham số: chiều rộng và chiều cao");
       }               
	}
}
