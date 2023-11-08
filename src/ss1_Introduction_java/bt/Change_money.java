package ss1_Introduction_java.bt;

import java.util.Scanner;

public class Change_money {
    public static void main(String[] args) {
        System.out.println("Nhập vào số tiền cần chuyển đổi  ");
        Scanner scanner = new Scanner(System.in);
        int usd = scanner.nextInt();
        if ( usd < 0 ){
            System.out.println(" số nhập vào không hợp lệ ");
        }else{
            int vnd = 23000 * usd ;
            System.out.println(" số tiền sau khi chuyển đổi " + vnd);
        }
        return ;
    }
}
