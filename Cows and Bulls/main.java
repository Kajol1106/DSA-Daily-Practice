import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc--> 0) {
           int size = sc.nextInt();
           String secret = sc.next();
           String guess = sc.next();
           System.out.println(cowsAndBulls(size, secret, guess));
        }
    }
    
    public static String cowsAndBulls(int size, String secret, String guess) {
        int bulls = 0, cows = 0;
        int[] numbers = new int[10];
        for(int i=0; i<size; i++) {
            int s = secret.charAt(i)-'0';
            int g = guess.charAt(i)-'0';
            if(s==g) {
                bulls++;
            }
            else {
                if(numbers[s]<0) cows++;
                if(numbers[g]>0) cows++;
                numbers[s]++;
                numbers[g]--;
            }
        }
        return bulls+"A"+cows+"B";
    }
}