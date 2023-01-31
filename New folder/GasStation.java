import java.util.*;


class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int     n = sc.nextInt();
        int[] arr = new int[n];
        int[] arr1 = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
         for(int i=0; i<n; i++){
            arr1[i]=sc.nextInt();
        }
        
        play(arr,arr1,n);
    }
    
    public static void play(int[] gas,int[] cost,int n){
            
      int s = 0;
       int a = 0;
       int pc = 0;
       for(int i = 0; i < n; i++){
           a+=gas[i]-pc;
           pc = cost[i];
           if(!(cost[i]<a)){
               s = i+1;
               a = 0;
               pc = 0;
           }
       }
       boolean flag = true;
       for(int i = 0; i < s; i++){
           
           
           a+=gas[i]-pc;
           pc = cost[i];
           
           if(!(cost[i]<=a)){
               System.out.println(-1);
               flag = false;
               break;
           }
           
               
           
       }
       if(flag)
       System.out.println(s);

    }
}
