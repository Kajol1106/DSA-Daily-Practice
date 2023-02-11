import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
  
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
		    int[] arr = new int[2*n-1];
		    for(int i=0; i<2*n-1; i++) {
		        arr[i] = sc.nextInt();
		    }
		    System.out.println(twiceExceptOne(n, arr));
		} 
       
    }

	public static int twiceExceptOne(int n, int[] arr) {
	    int res = arr[0];
	    for(int i=1; i<arr.length; i++) {
	        res = res ^ arr[i];
	    }
	    return res;
	}
}

