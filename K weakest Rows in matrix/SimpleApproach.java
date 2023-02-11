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
		int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[][] mat = new int[n][m];
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        weakestRows(n, m, k, mat);
    }

	public static void weakestRows(int n, int m, int k, int[][] mat) {
	    int[] index = new int[n];
	    for(int i=0; i<n; i++) {
	        index[i] = i;
	    }
	    
	    int[] res = new int[n];
	    for(int i=0; i<n; i++) {
	        int count = 0;
	        for(int j=0; j<m; j++) {
	            if(mat[i][j]==1) {
	                count++;
	            }
	        }
	        res[i] = count;
	    }
	    
	   // for(int i: res) {
	   //     System.out.print(i+" ");
	   // }
	   
	   for(int i=0; i<n-1; i++) {
	       for(int j=0; j<n-1-i; j++) {
	           if(res[j]>res[j+1]) {
	               swap(res, j, j+1);
	               swap(index, j, j+1);
	           }
	       }
	   }
	   
	   for(int i=0; i<k; i++) {
	       System.out.print(index[i]+" ");
	   }
	}
	
	public static void swap(int[] arr, int i, int j) {
	    int temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	}
}

