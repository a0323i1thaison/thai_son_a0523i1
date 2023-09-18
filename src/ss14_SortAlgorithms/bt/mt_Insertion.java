package ss14_SortAlgorithms.bt;

import java.util.Scanner;

public class mt_Insertion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào độ dài của chuỗi ");
        int size = scanner.nextInt();
        int [] arr=new int[size];
        System.out.println(" nhập vào từng giá trị của chuỗi ");
        for ( int i = 0 ; i < arr.length ;i++){
            arr[i]= scanner.nextInt();
        }
        insertion(arr);
    }
    public static void insertion ( int [] arr){
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }
}
