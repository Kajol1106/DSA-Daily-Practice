import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.*;
import java.util.Arrays;
  

  
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
		int n = sc.nextInt();   //amount
		int m = sc.nextInt();   //coin type
		int[] arr = new int[m]; //denomination
        for(int i=0; i<m; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(uniqueWaysOfCoinChange(0, n, arr, ""));
    }

	public static int uniqueWaysOfCoinChange(int ci, int rem, int[] arr, String paid) {
	    if(rem==0) {
	        //System.out.println(paid);
	        return 1;
	    }
	    
	    if(rem<0) {
	        return 0;
	    }
	    int res = 0;
	    for(int i=ci; i<arr.length; i++) {
	        res += uniqueWaysOfCoinChange(i, rem-arr[i], arr, paid+Integer.toString(arr[i])+", ");
	    }
	    
	    return res;
	}

    // public static int uniqueWaysOfCoinChange(int ci, int rem, int[] arr) {
	//     if(rem==0) {
	//         return 1;
	//     }
	    
	//     if(rem<0) {
	//         return 0;
	//     }
	//     int res = 0;
	//     for(int i=ci; i<arr.length; i++) {
	//         res += uniqueWaysOfCoinChange(i, rem-arr[i], arr);
	//     }
	    
	//     return res;
	// }
	
	
	
}

