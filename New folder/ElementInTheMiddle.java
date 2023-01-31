//Enter code here
import java.util.*;

class Main{
    
    
    static void play(int n,int[] arr){
        
        int max=-1;
        
        for(int i=1;i<n;i++){
            
            boolean r=true;
            boolean l=true;
            
            for(int j=i+1;j<n;j++){
                
                if(arr[i]>arr[j]){
                    r=false;
                     break;
                }
                
            }
            
            for(int k=i-1;k>=0;k--){
                if(arr[i]<arr[k]){
                    l=false;
                     break;
                }
            }
            if(r&&l){
                System.out.println(arr[i]);
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