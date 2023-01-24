import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=1; i<=num; i++) {
            if(i%2==0 && i%3==0) {
                System.out.println("Both");
            }
            else if(i%2==0) {
                System.out.println("Two");
            }
            else if(i%3==0) {
                System.out.println("Three");
            }
            else {
                System.out.println("None");
            }
        }
    }
}
