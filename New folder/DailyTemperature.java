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
       
       Stack<Integer>stack =new Stack();
       
       Stack<Integer>ans =new Stack();
       
       
       for(int i=n-1;i>=0;i--){
           
           while(stack.size()>0&&arr[i]>=arr[stack.peek()]){
               stack.pop();
           }
           
           if(stack.size()==0){
               ans.push(0);
           }else{
               ans.push(stack.peek()-i);
           }
           
           stack.push(i);
           
       }
       
       for(int i=ans.size()-1;i>=0;i--){
           
           System.out.print(ans.get(i)+" ");
       }
       
       System.out.println();
       
    }
}
