//Enter code here
import java.util.*;
class Main {
    
    public static void main(String[] args){
        
        Scanner sc=  new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- !=0){
            int n=sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i]=sc.nextInt();
            }
             abhi(arr,n);
        }
    }
    public static void abhi(int[] arr ,int n){
       
       int r5=0;
       int a5=0;
       int r10=0;
       int a10=10;
       
       for(int i=0;i<n;i++){
           if(arr[i]==5){
               a5++;
           }
           if(arr[i]==10){
               a10++;
               r5++;
           }
           if(arr[i]==20){
               r10++;
               r5++;
           }
       }
       if(a5>=r5&&a10>=r10){
           System.out.println("YES");
       }else{
           System.out.println("NO");
       }
 
       
       
    }
}









//Enter code here
//Enter code here
//Enter code here
import java.util.*;

class Main{
    
    public static void play(int n,int[]arr){
        
         int r5=0;
         int r10=0;
         int a5=0;
         int a10=0;
         
         for(int i=0;i<n;i++){
             if(arr[i]==5){
                 a5++;
             }
             if(arr[i]==10){
                 r5++;
                 a10++;
             }
             
             if(arr[i]==20){
                 r5++;
                 r10++;
             }
         }
         if(a5>=r5&&a10>=r10){
             System.out.println("YES");
         }else{
             System.out.println("NO");
         }
        
        
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