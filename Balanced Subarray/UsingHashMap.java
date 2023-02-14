import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.*;
import java.util.Map;
import java.util.HashMap;
  
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
            balancedSubarray(n, arr);
        }
    }

	public static void balancedSubarray(int n, int[] arr) {
	    int max = 0;
	    int count = 0;
	    Map<Integer, Integer> map = new HashMap<>();
	    map.put(0, -1);
	    for(int i=0; i<n; i++) {
	        count += (arr[i]==1) ? 1 : -1;
	        if(map.containsKey(count)) {
	            max = Math.max(max, i-map.get(count));
	        }
	        else {
	            map.put(count, i);
	        }
	    }
	    System.out.println(max);
	}
}