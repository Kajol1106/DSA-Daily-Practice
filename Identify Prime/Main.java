import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(!isPrime(n) ? "Yes" : "No");
    }
    
    public static boolean isPrime(int n) {
        boolean res = false;
        for(int i=2; i<=n/2; ++i) {
            //if number is not prime
            if(n%i==0) {
                res = true;
            }
        }
        return res;
    }
}