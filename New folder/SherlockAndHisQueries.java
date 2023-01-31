//Enter code here
import java.util.*;
import java.io.*;
class Main{
    static class FastReader
  {
    BufferedReader br;
    StringTokenizer st;
    public FastReader()
    {
      br = new BufferedReader(new InputStreamReader(System.in));
    }
    String next()
    {
      while (st == null || !st.hasMoreElements()){
        try { st = new StringTokenizer(br.readLine()); }
        catch (IOException e) { e.printStackTrace(); }
      }
      return st.nextToken();
    }
    int nextInt() { return Integer.parseInt(next()); }
    long nextLong() { return Long.parseLong(next()); }
    double nextDouble(){ return Double.parseDouble(next()); }
    String nextLine(){
      String str = "";
      try { str = br.readLine(); }
      catch (IOException e) { e.printStackTrace(); }
      return str;
    }
  }
  public static void main(String[] args){
     FastReader fs = new FastReader();
     int tc = fs.nextInt();
     for(int i=0; i<tc; i++){
         int n = fs.nextInt();
         int m = fs.nextInt();
         int nq = fs.nextInt();
         int[][] arr = new int[nq][2];
         for(int j=0; j<nq; j++){
             for(int k = 0; k<2; k++){
                 arr[j][k]=fs.nextInt();
             }
         }
        play(n,m,nq,arr);
     }
  }
  public static void play(int n, int m,int nq, int [][] arr){
       int mat[][] = new int[n][m];
      for(int i=0; i<n; i++){
           for(int j=0; j<m; j++){
               mat[i][j]=0;
           }
      }
      
      for(int i=0; i<nq; i++){
        
        if(arr[i][0]==0){
            
            for(int j=0;j<m;j++){
                mat[arr[i][1]][j]= (mat[arr[i][1]][j])+1;
            }
        }else{
            
             for(int j=0;j<n;j++){
                 
                mat[j][arr[i][1]]= (mat[j][arr[i][1]])+1;
            }
            
        }
        
        
      }
      int count = 0;
       for(int i=0; i<n; i++){
           for(int j=0; j<m; j++){
              if(mat[i][j]%2==1){
                  count++;
              }
           }
      }
      System.out.println(count);
 }

}