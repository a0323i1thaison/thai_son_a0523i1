package ss15_Exception;

import java.util.Scanner;

public class IllegalTriangleException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in);
        int a , b , c ;
        try {
            System.out.println(" nhập vào cạnh a của tam giác");
            a = scanner.nextInt();
            System.out.println(" nhập vào cạnh b của tam giác");
            b = scanner.nextInt();
            System.out.println(" nhập vào cạnh c của tam giác");
            c = scanner.nextInt();
            if (a <= 0 || b <= 0 || c<= 0 ) {
                throw new IllegalTriangle(" cạnh không âm !!!!!");
            }
            if( a + b <= c || a + c <= b || b + c <= a ) {
                throw new IllegalTriangle(" Tổng hai cạnh không lớn hơn cạnh còn lại ");
            }
            System.out.println(" ba cạnh " + a + " , " + b + " , " + c + " tạo thành một cái tam giác .");
        } catch (Exception e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
        finally {
            scanner.close();
        }
    }
    static class IllegalTriangle extends Exception {
        public IllegalTriangle(String message) {
            super(message);
        }
    }
}
