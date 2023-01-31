//Enter code here
//Enter code here
//Enter code here
import java.util.*;

class Main{
    
    public static void play(int n,int[]arr){
    
    Stack<Integer> stack= new Stack();
    Stack<Integer> ans= new Stack();
    
       for(int i=n-1;i>=0;i--){
           
           while(stack.size()>0&&arr[i]>=stack.peek()){
               stack.pop();
           }
            
            if(stack.size()==0){
                ans.push(arr[i]);
            }
               
          stack.push(arr[i]);
       }
     
     for(int i=ans.size()-1;i>=0;i--){
         System.out.print(ans.get(i)+" ");
     }
     
        
    }
    
    public static void main(String[] args){
        
        Scanner sc= new Scanner(System.in);
        
        int n=sc.nextInt();
        int[]arr=new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        play(n,arr);
        
        
    }
}