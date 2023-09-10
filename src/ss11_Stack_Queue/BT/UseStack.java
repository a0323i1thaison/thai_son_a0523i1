package ss11_Stack_Queue.BT;

import java.util.Stack;

public class UseStack {
    public static void main(String[] args) {
        int[] arr ={ 1,2,3,4,5,6};
        Stack<Integer> stack = new Stack<>();
        for (int i = 0 ; i < arr.length ; i++ ){
            stack.push(arr[i]);
        }
        int[] newArr= new int[arr.length];
        for (int i = 0 ; i < arr.length ; i++ ){
           newArr[i] = stack.pop();
        }
        for ( int i = 0 ; i < newArr.length ; i++){
            System.out.println(newArr[i] + " ");
        }
    }
}
