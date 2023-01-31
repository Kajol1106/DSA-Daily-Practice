//Enter code here
//Enter code here
//Enter code here
import java.util.*;

class Main{
    
    public static void play(int n,int[]arr,int[]arr1){
        
        int[]a = new int[n*2];
        int p=0;
        for(int i=0;i<n;i++){
            a[p++]=arr[i];
        }
        
        for(int i=0;i<n;i++){
            a[p++]=arr1[i];
        }
       
       Arrays.sort(a);
       
       for(int i=0;i<a.length;i++){
             
             System.out.print(a[i]+" ");
        }
       
        
    }
    
    public static void main(String[] args){
        
        Scanner sc= new Scanner(System.in);
        
        int n=sc.nextInt();
        int[]arr=new int[n];
        int[]arr1=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        
        play(n,arr,arr1);
        
        
    }
}
