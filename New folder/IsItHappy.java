//Enter code here
import java.util.*;

class Main{
    
    public static void fun(int n){
               
          Map<Integer,Integer> map = new HashMap<>();
            
            while(n!=1){
            
             n=play(n);
                 
                if(map.containsKey(n)){
                    System.out.println(false);
                  return;
                 }
                map.put(n,1);
                //n=sum;
               
              }
             
           System.out.println(true);
    }
    public static int play(int n){
        
        int s=0;
        
        while(n>0){
            
            int rem=n%10;
            s+=rem*rem;
            n=n/10;
        }
        
        return s;
        
    }
    
    public static void main(String [] args){
        
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        
        while(tc--!=0){
            
           int n=sc.nextInt();
        fun(n);
          
        
             }
 
        }
    
}