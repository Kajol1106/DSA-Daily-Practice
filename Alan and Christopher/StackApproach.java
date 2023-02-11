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
            String str = sc.next();
            alanChristopher(str);
            System.out.println();
        }
    }

	public static void alanChristopher(String str) {
	    Stack<Character> stack = new Stack<>();
	    for(int i=0; i<str.length(); i++) {
	        char ch = str.charAt(i);
	        if(ch=='#' && !stack.empty()) {
	            stack.pop();
	        }
	        else {
	            if(ch=='#') {
	                
	            }
	            else {
	                stack.push(ch);
	            }
	        }
	    }
	    
	    for(Character c: stack) {
	        System.out.print(c);
	    }
	}
}
