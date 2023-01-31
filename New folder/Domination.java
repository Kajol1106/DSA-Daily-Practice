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
    static void play(int n,int[]arr){
        
         Map<Integer,Integer>map=new LinkedHashMap();
         
         
         for(int i=0;i<n;i++){
             
             if(map.containsKey(arr[i])){
                 
                map.put(arr[i],map.get(arr[i])+1); 
                 
             }else{
                 
                 map.put(arr[i],1);
             }
             
             
             
             
         }
         int max=0;
         
        Set<Integer>set= map.keySet();
        
        for(Integer i:set){
            
            if(map.get(i)>max){
                max=map.get(i);
            }
        }
         int c=0;
           for(Integer i:set){
            
            if(map.get(i)==max){
                  c++;
            }
        }
        
        if(c==1){
            
            System.out.println("YES");
        }else{
            
            
            System.out.println("NO");
        }
         
         
   
           
        
        
     
 
        
    }
  public static void main(String[] args){
     FastReader sc = new FastReader();
       
        int tc=sc.nextInt();
        
        while(tc--!=0){
             int n=sc.nextInt();
              
        int[]arr=new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        play(n,arr);
     
  } 
}
//[1,2,6,24]
//[1,6,3,1]
}