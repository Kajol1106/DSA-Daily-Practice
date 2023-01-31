//Enter code here

import java.util.*;


class Main {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int     n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        
        play(arr,n);
    }
    
    public static void play(int[] arr,int n){
       
        for(int i=0;i<n-1;i++){
            
            if(arr[i]>arr[i+1]){
                System.out.println(arr[i+1]);
                
                 return;
            }
        }
        
        System.out.println(arr[0]);
        
    }
}
