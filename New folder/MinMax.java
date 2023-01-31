//Enter code here
//Enter code here
import java.util.*;
import java.io.*;
class Main{
    
    static BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st = null;
    static String next(){
        while(st==null || !st.hasMoreElements()){
            try{st = new StringTokenizer(sc.readLine());}
            catch(IOException e){e.printStackTrace();}
        }
        return st.nextToken();
    }
    
    public static void check(int[] arr){
        
        List<Integer> list = new ArrayList<>();
     for(int i =1;i<arr.length-1;i++) {
    	 if(arr[i-1]< arr[i] && arr[i+1]<arr[i]) {
    		list.add(i); 
    	 }
    	 
    	 else if( arr[i-1]> arr[i] && arr[i+1]>arr[i]) {
			 list.add(i);
		 }
    	 
     }
 
     if(list.size()<=1) {
    	 System.out.println("-1 -1");
     }
     else{

     int min = Integer.MAX_VALUE;
     int max = Math.abs(list.get(0)- list.get(list.size()-1));
    
      for(int i =0;i<list.size()-1;i++) {
    	 int diff = list.get(i+1)-list.get(i);
    	 min = Math.min(min, diff);
      }
    
     System.out.println(min+" "+max); 
     }
    
    }
   
    
    public static void main(String[] args){
          int tc = Integer.parseInt(next());
        while(tc--> 0){
             int n = Integer.parseInt(next());
            int[] arr = new int[n];
            for(int j =0;j<arr.length;j++){
                arr[j] = Integer.parseInt(next());
            }
            
          check(arr);
          
 }
}
}