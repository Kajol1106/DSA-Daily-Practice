import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String str = sc.next();
        if (checkPalindrome(size, str)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
    
    public static boolean checkPalindrome(int size, String str) {
        int left = 0;
        int right = size-1;
        while(left<right) {
            if(str.charAt(left) != str.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}