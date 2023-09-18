package ss13_SearchAlgorithms.bt;

import java.util.Scanner;

public class SearchString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner ( System.in);
        System.out.println(" nhập vào một chuỗi ");
        String str = scanner.nextLine();
        String [] substrings = str.split(" ");
        System.out.println(" chuôix được sắp xếp lại như sau : ");
        for ( String substring : substrings){
            System.out.println(substring);
        }
    }
}
