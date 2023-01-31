//Enter code here
import java.util.*;

class Main{
    
    public static void play(int n,int[]arr){
        
        Map<Integer,Integer> map = new HashMap();
        
        for(int i = 0; i < n; i++){
            
            if(map.containsKey(arr[i])){
                
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                
                map.put(arr[i],1);
            }
            
        }
        int max=1;
         for(Integer i:map.keySet()){
             if(map.get(i)>max){
                 max=map.get(i);
             }
         }
         
          for(Integer i:map.keySet()){
             if(map.get(i)==max){
                  System.out.println(i);
                  break;
             }
         }
        
    }
    
    public static void main(String[] args){
        
        Scanner sc= new Scanner(System.in);
        
        int n=sc.nextInt();
        int[]arr=new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        play(n,arr);
        
        
    }
}