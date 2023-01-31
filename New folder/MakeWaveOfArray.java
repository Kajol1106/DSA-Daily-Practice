import java.util.*;

class Main{
    
    
    static void play(int n,int[] arr){
        
         Arrays.sort(arr);
        
        for(int i=0;i<n;i=i+2){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        
        for(int i=0;i<n;i++){
            
            System.out.print(arr[i]+" ");
        }
       
         
         
        
        
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