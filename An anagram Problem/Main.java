import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.*;
import java.util.Vector;
import java.util.HashSet;
  
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
		String[] strArr = new String[n];
		for(int i=0; i<n; i++) {
		    strArr[i] = sc.next();
		}
		
// 		for(String s: strArr) {
// 		    System.out.println(s);
// 		}
        anagram(n, strArr);
       
    }

    public static void anagram(int n, String[] strArr) {
        Vector<String> res = new Vector<>();
        HashSet<String> found = new HashSet<>();
        for(int i=0; i<n; i++) {
            String word = strArr[i];
            word = sort(word);
            if(!found.contains(word)) {
                res.add(strArr[i]);
                found.add(word);
            }
        }
        
        Collections.sort(res);
        
        System.out.println(res.size());
        for(int i=0; i<res.size(); i++) {
            System.out.println(res.get(i));
        }
    }
	
	public static String sort(String str) {
	    char[] arr = str.toCharArray();
	    Arrays.sort(arr);
	    return new String(arr);
	}
}