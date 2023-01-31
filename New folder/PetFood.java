import java.util.*;

class Main{
    
    static void play(int[]arr){
        int rd=0;
        int rc=0;
        if(arr[3]>arr[0]){
            
             rd=Math.abs((arr[3]-arr[0]));
        }
        if(arr[4]>arr[1]){
           rc=Math.abs((arr[4]-arr[1]));  
        }
        
        
        int sum=rd+rc;
        if(arr[0]>=arr[3]&&arr[1]>=arr[4]){
            System.out.println("YES");
        }else if(sum<=arr[2]){
          System.out.println("YES");  
        }else{
            System.out.println("NO"); 
        }
        
        
    }
    
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        
        while(tc--!=0){
           
           int[] arr = new int[5];
           for(int i =0;i<5;i++){
               arr[i]=sc.nextInt();
               
           }
           
           play(arr);
            
        }
    }
}
 Overview
 Announcements
 Problems
 Submissions
 Rankings

