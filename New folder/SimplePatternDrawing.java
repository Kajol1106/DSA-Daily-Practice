//Enter code here
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
     int n=sc.nextInt();
     int m=sc.nextInt();
    
    int c=0;
    for(int i=0;i<n;i++){
        
        for(int j=0;j<m;j++){
            if(i%2==0){
                System.out.print("#");
            }else{
                if(c%2==0){
                    if(j==m-1){
                        System.out.print("#");
                    }else{
                       System.out.print("."); 
                    }
                }else{
                    if(j==0){
                        System.out.print("#");
                    }else{
                       System.out.print("."); 
                    }
                }
                c++;
            }
        }
        System.out.println();
    }
   
          
     
  }
}