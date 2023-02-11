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
        String[] arr = new String[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextLine();
        }
        // for(String s: arr) {
        //     System.out.print(s+" ");
        // }
        
        System.out.println(longestCForEachDay(arr)+" "+longestCForAllDay(arr));
    }
    
    public static int longestCForEachDay(String[] arr) {
        int count = 0;
        int max = 0;
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length(); j++) {
                if(arr[i].charAt(j) == 'C') {
                    count++;
                }
                else {
                    max = Math.max(max, count);
                    count = 0;
                }
            }
            max = Math.max(max, count);
            count = 0;
        }
        return max;
    }
    
    public static int longestCForAllDay(String[] arr) {
        int count = 0;
        int max = 0;
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length(); j++) {
                if(arr[i].charAt(j) == 'C') {
                    count++;
                }
                else {
                    max = Math.max(max, count);
                    count = 0;
                }
            }
        }
        max = Math.max(max, count);
        return max;
    }

	
}

