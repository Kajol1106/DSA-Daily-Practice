//Enter code here
//Enter code here
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
		int tc = sc.nextInt();
        while(tc--> 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
            }
            financial(n, arr);
            //System.out.println();
        }
    }

    public static void financial(int n, int[] arr) {
        int[] res = new int[n];
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0; i<n; i++) {
            while(!stack.empty() && arr[stack.peek()]<=arr[i]) {
                stack.pop();
            }
            
            if(stack.empty()) {
                res[i] = i+1;
            }
            else {
                res[i] = i-stack.peek();
            }
            stack.push(i);
        }
        
        StringBuilder ans = new StringBuilder();
        
        for(int i: res) {
            //System.out.print(i+" ");
            ans.append(i+" ");
        }
        System.out.println(ans.toString());
    }
	
}