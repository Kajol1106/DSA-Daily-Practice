import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.*;
import java.util.List;
import java.util.ArrayList;
  
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
		List<List<String>> list = new ArrayList<>();
        while(n--> 0) {
            List<String> input = Arrays.asList(sc.nextLine().split(" "));
            list.add(input);
        }
        //System.out.println(list);
        makeLeaderBoard(n, list);
    }

	public static void makeLeaderBoard(int n, List<List<String>> list) {
	    Collections.sort(list, (l1, l2) -> {
	        if(Integer.parseInt( l1.get(1)) > Integer.parseInt(l2.get(1) )) {
	            return -1;
	        }
	        else if(Integer.parseInt( l1.get(1)) < Integer.parseInt(l2.get(1) )) {
	            return 1;
	        }
	        else {
	            return l1.get(0).compareTo(l2.get(0));
	        }
	    });
	    
	    //System.out.println(list);
	   // for(int i=0; i<list.size(); i++) {
	   //     System.out.println(i + " "+ list.get(i).get(0));
	   // }
	   int j = 1, rank = 1, count = 0;
	   String previous = " ";
	   for(int i=0; i<list.size(); i++) {
	       if(list.get(i).get(1).equals(previous)) {
	           System.out.println(rank + " "+ list.get(i).get(0));
	           
	       }
	       else {
	           rank += count;
	           System.out.println(rank + " "+ list.get(i).get(0));
	           count = 0;
	       }
	       count++;
	       previous = list.get(i).get(1);
	   }
	}
}
