//Enter code here
import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int     n = sc.nextInt();
        int     k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        
        play(arr,n,k);
    }
    
    public static void play(int[] arr,int n,int k){
        
        int sum=0;
        
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        
        int max=sum;
        
        for(int i=k;i<n;i++){
            sum+=arr[i]-arr[i-k];
            if(max<sum){
                max=sum;
            }
        }
        System.out.println(max);
        
        
        
    }
}
 Overview
 Announcements
 Problems
 Submissions
 Rankings
