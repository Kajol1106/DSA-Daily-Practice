//Enter code here
import java.util.*;

class Main{
    
    
    static void play(int[] arr){
        
        if((arr[0]+arr[1])>arr[2]&&
        (arr[2]+arr[1])>arr[0]&&
        (arr[0]+arr[2])>arr[1]){
            
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
        
    }
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        
        int tc=sc.nextInt();
        
        while(tc--!=0){

                
                int[]arr = new int[3];
                
                for(int j=0;j<3;j++){
                    
                 arr[j]=sc.nextInt();
                }
                
                play(arr);
                 
                 
            }
            
            
        }
        
        
    
    
}
