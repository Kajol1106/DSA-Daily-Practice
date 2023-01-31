//Enter code here
//using fastReader

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.*;
import java.util.Map;
import java.util.LinkedHashMap;
  
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
		    cipherString(n, str);
		    System.out.println();
		}
    }

	public static void cipherString(int n, String str) {
	    Map<Character, Integer> map = new LinkedHashMap<>();
	    for(int i=0; i<n; i++) {
	        if(map.containsKey(str.charAt(i))) {
	            map.put(str.charAt(i), map.get(str.charAt(i))+1);
	        }
	        else {
	            if(map.size()>0) {
	                System.out.print(str.charAt(i-1)+""+map.get(str.charAt(i-1)));
	                map.remove(str.charAt(i-1));
	            }
	            map.put(str.charAt(i), 1);
	        }
	    }
	    System.out.print(str.charAt(n-1)+""+map.get(str.charAt(n-1)));
	}
}

