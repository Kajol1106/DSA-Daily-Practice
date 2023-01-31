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
    static void play(String str){
        
        Stack stack=new Stack();
        
        for(int i=0;i<str.length();i++){
            
           
            
            if(str.charAt(i)=='#'&&stack.size()>0){
                stack.pop();
                
            }else{
                
                if(str.charAt(i)=='#'){
                    
                }
                else{
                  stack.push(str.charAt(i));  
                }
                
            }
            
            
        }
        
     for(Object i:stack){
         
         System.out.print(i);
     }     
         
       System.out.println();  
    
        
    }
  public static void main(String[] args){
     FastReader sc = new FastReader();
       
        int tc=sc.nextInt();
        
        while(tc--!=0){
         String str=sc.next();
        
        play(str);
     
  } 
}
//[1,2,6,24]
//[1,6,3,1]
}
