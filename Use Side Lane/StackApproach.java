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
		while(true) {
		    int n = sc.nextInt();
		    if(n==0) {
		        break;
		    }
		    int[] arr = new int[n];
		    for(int i=0; i<n; i++) {
		        arr[i] = sc.nextInt();
		    }
		    useSideLane(n, arr);
		}
    }

    public static void useSideLane(int n, int[] arr) {
        Stack<Integer> stack = new Stack<>();
        boolean flag = true;
        int current = 1;
        for(int i=0; i<n; i++) {
            if(arr[i]==current) {
                current++;
                continue;
            }
            
            while(!stack.isEmpty() && stack.peek()==current) {
                current++;
                stack.pop();
            }
            
            if(!stack.isEmpty() && arr[i]>stack.peek()) {
                flag = false;
                break;
            }
            stack.push(arr[i]); 
        }
        
        
        if(flag==true) {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
	
}