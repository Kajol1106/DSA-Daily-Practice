//Enter code here
import java.util.*;

class Main{
    
    
    static void play(int n,int[] arr){
        
        int sum=0;
        for(int i=1;i<n;i++){
            sum+=arr[i];
        }
        
        int ans=-1;
        int sum1=0;
        for(int j=1;j<n;j++){
            sum1+=arr[j-1];
            sum-=arr[j];
            if(sum==sum1){
                
                System.out.println(j+1);
                return;
            }
            
        }
        System.out.println(-1);
        
        
    }
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        
        

                
                int[]arr = new int[n];
                
                for(int j=0;j<n;j++){
                    
                 arr[j]=sc.nextInt();
                }
                
                play(n,arr);
                 
                 
            }
            
            
        
        
        
    
    
}
