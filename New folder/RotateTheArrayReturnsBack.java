import java.util.*;

class Main{
    
    
    static void play(int n,int k,int[] arr){
        
         int ans=k%n;
         
         for(int i=n-ans;i<n;i++){
             
             System.out.print(arr[i]+" ");
         }
         
         for(int i=0;i<n-ans;i++){
             
             System.out.print(arr[i]+" ");
         }
        
        System.out.println();
        
        
         
         
        
        
    }
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        
            int tc=sc.nextInt();
        
        while(tc--!=0){

                int n=sc.nextInt();
                int k=sc.nextInt();
                int[]arr = new int[n];
                
                for(int j=0;j<n;j++){
                    
                 arr[j]=sc.nextInt();
                }
                
                play(n,k,arr);
        }      
                 
            }
            
            
        
        
        
    
    
}
