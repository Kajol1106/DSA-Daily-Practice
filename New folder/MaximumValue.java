//Enter code here
import java.util.*;

class Main{
    
   static void  play(int n,int[] arr){
       
      Map<Integer,Integer> map = new HashMap<>();
      
       int max = 0; 
       for(int i = 0; i < n; i++){
           if(map.containsKey(arr[i])){
               
               if(max<i-map.get(arr[i]))
               max = i-map.get(arr[i]);
           }else{
               map.put(arr[i],i);
           }
       }
       System.out.println(max);

       
        
       
   };
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        
        while(tc--!=0){
            int n=sc.nextInt();
            int[]arr=new int[n];
            
            for(int i =0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            play(n,arr);
        }
    }
}