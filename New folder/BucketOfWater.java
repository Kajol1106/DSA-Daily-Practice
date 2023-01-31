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
  static void abhi(int[] arr,int[]arr1,int n){
        
        long rem=0;
        
        for(int i=0;i<n;i++){
            rem+=arr[i];
        }
  Arrays.sort(arr1);
  
  int l=0;
  int r=arr1.length-1;
  
  while(l<r){
      
      long sum=arr1[l]+arr1[r];
      
      if(sum>=rem){
          System.out.println("YES");
          return;
      }else{
          l++;
      }
   }
  
  System.out.println("NO");
             
        
    }
  public static void main(String[] args){
     FastReader sc = new FastReader();
       
        
          int tc = sc.nextInt();
            while(tc-- !=0){
                
            int n=sc.nextInt();
            int[] arr = new int[n];
            int[] arr1=new int[n];
            for(int i=0; i<n; i++){
                arr[i]=sc.nextInt();
            }
            for(int i=0; i<n; i++){
                arr1[i]=sc.nextInt();
            }
             abhi(arr,arr1,n);
        }
        
  }
}
