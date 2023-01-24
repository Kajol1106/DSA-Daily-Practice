import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        
        for(int i=0; i<tc; i++) {
            int n = sc.nextInt();
            int target = sc.nextInt();
            int[] arr = new int[n];
            for(int j=0; j<n; j++) {
                arr[j] = sc.nextInt();
            }
            //displayData(n, target, arr);
            int[] res = twoSum(n, target, arr);
            for(int r: res) {
                System.out.print(r+" ");
            }
            System.out.println();
        }  
    }
    
 /*
 TC : O(N*N)
SC : O(1)
 */
    public static int[] twoSum(int n, int target, int[] arr) {
        for(int i=0; i<n-1; i++) {
            for(int j=i+1; j<n; j++) {
                if(arr[i]+arr[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {-1, -1};
    }
}

