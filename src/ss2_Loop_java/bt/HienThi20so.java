package ss2_Loop_java.bt;

import java.util.Scanner;

public class HienThi20so {
    public static void main( String[] arge){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the numbers your keyboard to display");
        int number = scanner.nextInt();
        int count = 0 ;
        int n = 2 ;
        System.out.println(number + "prime numbers");
        while ( count < number ){
            if ( isPrime (n)){
                System.out.println(n + " ");
                count++;
            }
            n++;
        }
    }
    public static boolean isPrime ( int number ){
        if ( number <= 1){
            return false ;
        }
        for ( int i = 2 ; i <= Math.sqrt(number);i++){
            if ( number % i == 0 ){
                return false;
            }
        }
        return true;
    }
}
