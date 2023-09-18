package ss14_SortAlgorithms.bt;

import java.util.Arrays;
import java.util.Scanner;

public class Insertion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào độ dài của chuỗi ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println(" nhập vào từng giá trị của chuỗi ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        insertion(arr);
    }

    public static void insertion(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            System.out.println("Bước " + i + ":");
            System.out.println("Phần tử hiện tại: " + key);
            System.out.println("Danh sách hiện tại: " + Arrays.toString(arr));


            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;

                System.out.println("Dịch chuyển phần tử " + arr[j + 1] + " sang phải");
                System.out.println("Danh sách sau dịch chuyển: " + Arrays.toString(arr));
            }

            arr[j + 1] = key;

            System.out.println("Chèn phần tử " + key + " vào vị trí " + (j + 1));
            System.out.println("Danh sách sau khi chèn: " + Arrays.toString(arr));
            System.out.println();
        }

        System.out.println("Kết quả sau khi sắp xếp: " + Arrays.toString(arr));
        }
    }