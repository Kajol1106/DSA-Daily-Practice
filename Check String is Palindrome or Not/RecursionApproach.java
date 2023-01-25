import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String str = sc.next();
        if (checkPalindrome(0, size-1, str)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
    
    public static boolean checkPalindrome(int left, int right, String str) {
        if(left>=right) return true;
        if(str.charAt(left) != str.charAt(right)) return false;
        return checkPalindrome(left+1, right-1, str);
    }
}