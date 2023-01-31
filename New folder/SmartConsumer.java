//Enter code here
//Enter code here
import java.util.*;

class Main{
    
    static void play(int n,int c,int k,int[]arr){
        
        int s=0;
        for(int i =0;i<n;i++){
            
            s+=arr[i];
        }
        int s1=c;
        
        for(int i=0;i<n;i++){
            if(arr[i]<=k){
                s1+=0;
            }else{
                s1+=(arr[i]-k);
            }
        }
       // System.out.println(s);
        if(s1<s){
            System.out.println("YES");
        }else{
           System.out.println("NO"); 
        }
         
        
    }
    
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        
        while(tc--!=0){
           
           int n=sc.nextInt();
           int c=sc.nextInt();
           int k=sc.nextInt();
           
           int[] arr1 = new int[n];
           for(int i =0;i<n;i++){
               arr1[i]=sc.nextInt();
               
           }
           
           play(n,c,k,arr1);
            
        }
    }
}