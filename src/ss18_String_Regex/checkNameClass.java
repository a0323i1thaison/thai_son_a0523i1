package ss18_String_Regex;

import java.util.Scanner;

public class checkNameClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" hãy nhập vào tên lớp học của bạn ");
        String className = scanner.nextLine();
        String regexName = "^[CAP]\\d{4}[GHIKLM]$";
        boolean result = className.matches(regexName);
        System.out.println(" kết quả là " + result);
    }
}
