package ss11_Stack_Queue.BT;

import java.util.Scanner;
import java.util.Stack;

public class ChangeBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhập một số trong hệ thập phân : ");
        int num = scanner.nextInt();
        Stack<Integer> stack = new Stack<>();
        while ( num != 0 ){
            int newNum = num % 2 ;
            stack.push(newNum);
            num /= 2 ;
        }
        System.out.println(" số sau chuyển đổi là ");
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
