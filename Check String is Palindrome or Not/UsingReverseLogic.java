import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String str = sc.next();
        checkPalindrome(size, str);
    }
    
    public static void checkPalindrome(int size, String str) {
        String rev = "";
        for(int i=size-1; i>=0; i--) {
            rev += str.charAt(i);
        }
        if(str.equals(rev)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
