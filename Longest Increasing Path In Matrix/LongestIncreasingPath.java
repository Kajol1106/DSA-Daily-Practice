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
		int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] mat = new int[m][n];
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println(longestIncreasingPath(m, n, mat));
    }
    
    //static int[][] dir = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}}; //down, up, right, left
    
    
    //TC = O(MN)
    //SC = O(MN)
    public static int longestIncreasingPath(int m, int n, int[][] mat) {
        if((mat==null) || (m==0)) return 0;
        
        //using for memorisation purpose
        int[][] mem = new int[m][n];
        
        int longestPath = 0;
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                int path = dfs(mat, m, n, i, j, mem);
                longestPath = Math.max(path, longestPath);
            }
        }
        return longestPath;
    }
    
    public static int dfs(int[][] mat, int m, int n, int i, int j, int[][] mem) {
        if(mem[i][j]>0) return mem[i][j];
        int[][] dir = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}}; //down, up, right, left
        int max = 0;
        for(int[] d: dir) {
            int x = i+d[0], y = j+d[1];
            if(x>=0 && y>=0 && x<m && y<n && mat[x][y]>mat[i][j]) {
                max = Math.max(max, dfs(mat, m, n, x, y, mem));
            }
        }
        mem[i][j] = max+1;
        return max+1;
    }
	
}
