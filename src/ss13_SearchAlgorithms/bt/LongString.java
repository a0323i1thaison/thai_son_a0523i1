package ss13_SearchAlgorithms.bt;

import java.util.Scanner;

public class LongString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println(" nhập vào một chuỗi ");
        String str = scanner.nextLine();
        int maxLength = 0 ;
        String longString = "" ;
        for ( int i = 0; i< str.length();i++ ){
            StringBuilder sb = new StringBuilder();
            for ( int j = i ; j < str.length();j++){
                char c = str.charAt(j);
                if (sb.toString().indexOf(c) == -1 ){
                    sb.append(c);
                }else {
                    break;
                }
            }
            if (sb.length() > maxLength) {
                maxLength = sb.length();
                longString = sb.toString();
            }
        }
        System.out.println(" mảng có độ dài lớn nhất là :" + longString);
    }
}
