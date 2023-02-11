import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.*;
import java.util.Stack;
  
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
        String str = sc.next();
        warOfMinions(n, str);
    }

	public static void warOfMinions(int n, String str) {
	    Stack<Character> stack = new Stack<>();
	    for(int i=0; i<n; i++) {
	        if(!stack.isEmpty() && stack.peek()==str.charAt(i)) {
	            stack.pop();
	        }
	        else {
	            stack.push(str.charAt(i));
	        }
	    }
	    
	    StringBuilder res = new StringBuilder();
	    
	    if(stack.isEmpty()) {
	        System.out.println("-1");
	    }
	    else {
	        for(int i=0; i<stack.size(); i++) {
	            res.append(stack.get(i));
	        }
	        System.out.println(res);
	    }
	}
}


