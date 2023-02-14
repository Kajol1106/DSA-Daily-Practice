import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.*;
  
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
        //FastReader sc = new FastReader();
        Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		sc.nextLine();
        String[] strArr1 = sc.nextLine().split(" ");
        String[] strArr2 = sc.nextLine().split(" ");
        int n = strArr1.length;
        int[] arr1 = new int[n];
        for(int i=0; i<n; i++) {
            arr1[i] = Integer.parseInt(strArr1[i]);
        }
        int[] arr2 = new int[n];
        for(int i=0; i<n; i++) {
            arr2[i] = Integer.parseInt(strArr2[i]);
        }
        
        // for(int i: arr1) {
        //     System.out.print(i+" ");
        // }
        manageForum(k, n, arr1, arr2);
    }

	public static void manageForum(int k, int n, int[] arr1, int[] arr2) {
	    Arrays.sort(arr1);
	     Arrays.sort(arr2);
	     
	     int count = 0, i = 0, j = 0, sum = 0;
	     while(i<n && j<n) {
	         if(arr1[i]<=arr2[j]) {
	             sum++;
	             i++;
	         }
	         else if(arr1[i]>arr2[j]) {
	             sum--;
	             j++;
	         }
	         count = Math.max(count, sum);
	     }
	     
	     if(count<=k) {
	         System.out.println("Possible");
	     }
	     else {
	         System.out.println("Not Possible");
	     }
	}
}