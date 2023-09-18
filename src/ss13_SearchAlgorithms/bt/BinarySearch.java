package ss13_SearchAlgorithms.bt;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println(" hãy nhập vào độ dài của chuỗi ");
        int size = scanner.nextInt();
        int [] arr = new int[size];
        System.out.println(" nhập vào từng giá trị của mảng ");
        for ( int i =0 ; i < size ; i++){
            arr[i]=  scanner.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(" mảng sau khi sắp xếp là  : " + Arrays.toString(arr));
        scanner.close();
        int value = 5;
        int index = binarySearch(arr,0 ,size - 1, value);
        if ( index == -1){
            System.out.println(" phần tử không có trong mảng ");
        }else {
            System.out.println(" vị trí của phần tử đó là : " +  index);
        }
    }
    public static int  binarySearch( int [] arr, int left , int right , int value){
        while ( left <= right ) {
            int middle = ( left + right )/ 2;
            if ( arr[middle] == value ){
                return middle;
            }
            if ( arr [ middle ] == value ){
                left = middle + 1;
            }else{
                right = middle - 1;

            }
        }
        return -1;
    }
}