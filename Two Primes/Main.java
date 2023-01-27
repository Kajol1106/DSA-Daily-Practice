import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println((!isPrime(a) && !isPrime(b)) ? "True" : "False");
    }
    
    public static boolean isPrime(int num) {
        boolean res = false;
        for(int i=2; i<=num/2; ++i) {
            if(num%i == 0) {
                res = true;
            }
        }
        return res;
    }
}