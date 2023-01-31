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
     FastReader sc = new FastReader();
            int n = sc.nextInt();
            
            int arr[]= new int[n];
            
            for(int i=0;i<n; i++){
                arr[i] = sc.nextInt();
            }
            
            int q = sc.nextInt();
            
            for(int i=0;i<q;i++){
                int l=sc.nextInt()-1;
                int r=sc.nextInt()-1;
                int a=sc.nextInt();
                int b=sc.nextInt();
                long c=0;
                for(int j=l; j<=r;j++){
                    
                    if(arr[j]>=a&&arr[j]<=b)
                    c++;
                }
                System.out.println(c);
            }
             
 }
  
}
