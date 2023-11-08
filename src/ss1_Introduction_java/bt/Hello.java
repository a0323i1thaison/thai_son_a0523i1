package ss1_Introduction_java.bt;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhập vào tên của bạn ");
        String name = scanner.nextLine();
        System.out.println(" hello : " + name );
    }
}
