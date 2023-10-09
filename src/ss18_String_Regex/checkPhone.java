package ss18_String_Regex;

import java.util.Scanner;

public class checkPhone {
    public static void main(String[] args) {
        System.out.println(" nhập vào số điện thoại để check");
        Scanner scanner = new Scanner(System.in);
        String phoneNumber = scanner.nextLine();
        String regexPhone = "^\\(84\\)-0\\d{9}$";
        boolean result = phoneNumber.matches(regexPhone) ;
        System.out.println(" kết quả là " + result);
    }
}
