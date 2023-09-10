package ss11_Stack_Queue.BT;

import java.util.LinkedList;
import java.util.Queue;

public class CheckPalindrome {
    public static boolean isPalindrome(String string) {
        Queue<Character> queue = new LinkedList<Character>();
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            queue.add(ch);
  }
        while (queue.size() > 1) {
            char first = queue.poll();
            char last = queue.remove();
            if ( first != last ){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String palindrome = " Able was I ere I saw Elba ";
        boolean isPalindrome = isPalindrome(palindrome);
        System.out.println(" Is Palindrome : " +isPalindrome );
    }
}
