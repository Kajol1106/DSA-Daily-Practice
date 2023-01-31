//Enter code here
import java.util.*;

class Main{
    
    public static void play(int n,int[]arr){
    
     Arrays.sort(arr);
     
     int l=0;
     int r=n-1;
     
     while(l<r){
         
         int sum=arr[l]+arr[r];
         
         if(sum==0){
             System.out.println(arr[r]);
             return;
         }
         else if(sum>0){
             r--;
             
         }else{
             l++;
         }
         
         
         
         
     }
     
     System.out.println(-1);
    
      
     
     
        
    }
    
    public static void main(String[] args){
        
        Scanner sc= new Scanner(System.in);
        int tc=sc.nextInt();
        
        while(tc--!=0){
            
        int n=sc.nextInt();
        int[]arr=new int[n];
        
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        play(n,arr);
        
        }
    }
}