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
    public static void Product(int n,int[] arr){
        
        int[]arr1= new int[n];
        int[]arr2= new int[n];
        int p=1;
        
        for(int i=0;i<n;i++){
            
            arr1[i]=p;
            p*=arr[i];
        }
        p=1;
        for(int i=n-1;i>=0;i--){
            
            arr2[i]=p;
            p*=arr[i];
        }
        int[] arr3=new int[n];
        for(int i=0;i<n;i++){
            
        arr3[i]=(arr1[i]*arr2[i]);
        }
        //System.out.println();
        System.out.println(Arrays.toString(arr3).replace("[", "").replace("]", "").replace(",", ""));
    };
  public static void main(String[] args){
     FastReader sc= new FastReader();
        
        
        int tc=sc.nextInt();
        
        while(tc--!=0){
            
            int n=sc.nextInt();
            int[]arr=new int[n];
            
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            
            Product(n,arr);
  }
}
}

