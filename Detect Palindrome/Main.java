import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(isPalindrome(num)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
    
    public static boolean isPalindrome(int num) {
        int reverse = reverse(num);
        if(reverse == num) return true;
        return false;
    }
    
    public static int reverse(int num) {
        int reverse = 0;
        while(num > 0) {
            reverse = (reverse*10) + (num%10);
            num = num/10;
        }
        return reverse;
    }
}