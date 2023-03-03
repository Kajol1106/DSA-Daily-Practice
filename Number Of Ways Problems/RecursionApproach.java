import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(numberOfWays(n, 0));
    }
    
    public static int numberOfWays(int n, int steps) {
        if(steps>n) {
            return 0;
        }
        if(steps==n) {
            return 1;
        }
        return numberOfWays(n, steps+1) + numberOfWays(n, steps+2) + numberOfWays(n, steps+3);
    }
}