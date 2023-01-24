import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
  
public class Main {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
  
        public FastReader()
        {
            br = new BufferedReader(
                new InputStreamReader(System.in));
        }
  
        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
  
        int nextInt() { return Integer.parseInt(next()); }
  
        long nextLong() { return Long.parseLong(next()); }
  
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
  
        String nextLine()
        {
            String str = "";
            try {
                if(st.hasMoreTokens()){
                    str = st.nextToken("\n");
                }
                else{
                    str = br.readLine();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
  
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int tc = sc.nextInt();
        while(tc--> 0) {
            int n = sc.nextInt();
            int target = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
            }
            int[] res = towSum(n, target, arr);
            for(int i:res) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    
    /*
    TC : 
     O(N), as even in the worst case, we visit all the elements in the array only once.
    O(NlogN) – If the given array is not sorted

    SC : O(1)
     */

     public static int[] twoSum(int n, int target, int[] arr) {
        int left = 0;
        int right = n-1;
        while(left<right) {
            if(arr[left]+arr[right]==target) {
                return new int[] {left, right};
            }
            else if (arr[left]+arr[right]<target) {
                left++;
            }
            else {
                right--;
            }
        }
        return new int[] {-1, -1};
    }
}

