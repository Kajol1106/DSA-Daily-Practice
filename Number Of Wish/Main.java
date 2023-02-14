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
            String str = sc.next();
            numberOfWish(n, str);
        }
    }

	public static void numberOfWish(int n, String str) {
	    int count = 0;
	    int w = 0, i = 0, s = 0, h = 0;
	    for(int j=0; j<n; j++) {
	        char ch = str.charAt(j);
	        if(ch=='w') {
	            w++;
	        }
	        else if(ch=='i') {
	            i++;
	        }
	        else if(ch=='s') {
	            s++;
	        }
	        else if(ch=='h') {
	            h++;
	        }
	        else {
	            
	        }
	        
	        if(w>=1 && i>=1 && s>=1 && h>=1) {
	            count++;
	            w--;
	            i--;
	            s--;
	            h--;
	        }
	    }
	    System.out.println(count);
	}
}