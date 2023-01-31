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
            sqRootSorting(arr,n);
        }
    }
    public static void sqRootSorting(int[] arr ,int n){
       
       int max=0;
       
       for(int i=0;i<n;i++){
           if(arr[i]>arr[i+1]){
               max=i;
               break;
           }
    }
    
    System.out.println(max);
}
}