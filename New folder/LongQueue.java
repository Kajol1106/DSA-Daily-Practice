//Enter code here
import java.util.*;
class Main{
    
    public static void main(String[]args){
        
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int[]arr= new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        Stack<Integer>stack =new Stack();
        int c=1;
        
        
        for(int i=0;i<n;i++){
            
            if(stack.size()>0&&arr[i]<stack.peek()){
                stack.pop();c++;
            }
            
            stack.push(arr[i]);
        }
        System.out.println(c);
        
    }
}