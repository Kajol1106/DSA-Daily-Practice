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
		char[] arr = new char[2*n];
        generateParenthesis(n, arr);
    }

	public static void generateParenthesis(int n, char[] arr) {
	    if(n>0) {
	        parenthesis(n, arr, 0, 0, 0);
	    }
	    return;
	}
	
	public static void parenthesis(int n, char[] arr, int pos, int openBrace, int closeBrace) {
	    if(closeBrace == n) {
	        for(int i=0; i<arr.length; i++) {
	            System.out.print(arr[i]);
	        }
	        System.out.print(" ");
	        return;
	    }
	    else {
	        if(openBrace<n) {
	            arr[pos] = '(';
	            parenthesis(n, arr, pos+1, openBrace+1, closeBrace);
	        }
	        
	        if(openBrace>closeBrace) {
	            arr[pos] = ')';
	            parenthesis(n, arr, pos+1, openBrace, closeBrace+1);
	        }
	    }
	}
}
