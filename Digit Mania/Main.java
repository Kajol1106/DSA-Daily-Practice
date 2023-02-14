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
            int k = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
            }
            digitMania(n, k, arr);
        }
    }

	public static void digitMania(int n, int k, int[] arr) {
	    int max = 0;
	    int num = 0;
	    for(int i=0; i<n; i++) {
	        int count = digitCount(arr[i], k);
	        if(count>max) {
	            max = count;
	            num = arr[i];
	        }
	        else if(count==max) {
	            num = Math.max(num, arr[i]);
	        }
	    }
	    if(max==0) {
	        System.out.println("-1");
	    }
	    else {
	        System.out.println(num);
	    }
	}
	
	public static int digitCount(int n, int digit) {
	    int count = 0;
	    while(n>0) {
	        if(n%10==digit) {
	            count++;
	        }
	        n = n/10;
	    }
	    return count;
	}
}


