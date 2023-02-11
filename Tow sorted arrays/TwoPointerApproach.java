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
        FastReader sc = new FastReader();
		int tc = sc.nextInt();
		while(tc--> 0) {
		    int n = sc.nextInt();
		    int[] arr1 = new int[n];
		    for(int i=0; i<n; i++) {
		        arr1[i] = sc.nextInt();
		    }
		    
		    int[] arr2 = new int[n];
		    for(int i=0; i<n; i++) {
		        arr2[i] = sc.nextInt();
		    }
		    
		    twoSortedArrays(n, arr1, arr2);
		}
       
    }

	public static void twoSortedArrays(int n, int[] arr1, int[] arr2) {
	    int left = 0, right = n-1, count = 0;
	    while(left<n && right>=0) {
	        if(arr1[left]<arr2[right]) {
	            left++;
	        }
	        else if(arr1[left]>arr2[right]) {
	            right--;
	        }
	        else {
	            count++;
	            left++;
	            right--;
	        }
	    }
	    System.out.println(count);
	}
}

