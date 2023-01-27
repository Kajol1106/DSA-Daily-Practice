import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] mat = new int[n][m];
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println(prime(n, m, mat));
    }
    
    public static int prime(int n, int m, int[][] mat) {
        int count = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(isPrime(mat[i][j])) {
                    count++;
                }
            }
        }
        return count;
    }
    
    public static boolean isPrime(int n) {
        boolean res = false;
        if(n == 1 || n == 0) {
            res = true;
        }
        for(int i=2; i<=n/2; ++i) {
            if(n%i==0) {
                res = true;
            }
        }
        return res;
    }
}
