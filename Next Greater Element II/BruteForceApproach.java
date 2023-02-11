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
            int[] arr = new int[n];
            for(int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
            }
            nextGreater(n, arr);
            System.out.println();
        }
    }

	public static void nextGreater(int n, int[] arr) {
	    //int len = 2*n;
	    int[] newArr = new int[2*n];
	    for(int i=0; i<2*n; i++) {
	        newArr[i] = arr[i%n];
	    }
	    
	   // for(int i: newArr) {
	   //     System.out.print(i+" ");
	   // }
	   
	   int next;
	   for(int i=0; i<n; i++) {
	       next = -1;
	       for(int j=i+1; j<2*n; j++) {
	           if(newArr[i]<newArr[j]) {
	               next = newArr[j];
	               break;
	           }
	       }
	       System.out.print(next+" ");
	   }
	}
}
