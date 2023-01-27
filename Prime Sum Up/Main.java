import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int sum = 0;
        for(int i=2; i<=n; i++) {
            if(!isPrime(i)) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
    
    public static boolean isPrime(int n) {
        boolean res = false;
        for(int i=2; i<=n/2; ++i) {
            if(n%i==0) {
                res = true;
            }
        }
        return res;
    }
}
