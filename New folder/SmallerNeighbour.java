import java.util.*;

class Main{
    
    static void play(int[]arr){
        
        
        Stack<Integer> stack =new Stack();
        
        Stack<Integer> ans=new Stack();
        
        int s=0;
        
        for(int i=0;i<arr.length;i++){
           
           while(stack.size()>0&&stack.get(stack.size()-1)>=arr[i]){
               
               stack.pop();
           }
           
           if(stack.size()==0){
               ans.push(-1);
           }else{
               ans.push(stack.get(stack.size()-1));
           }
           
            stack.push(arr[i]);
        }
        
        int sum=0;
        for(int j=0;j<arr.length;j++){
            System.out.print(ans.get(j)+" ");
        }
        
        
    }
    
    public static void main(String[]args){
        
        Scanner sc=new Scanner(System.in);
     
            int n=sc.nextInt();
          int[]arr=new int[n];
          for(int j=0;j<n;j++){
              arr[j]=sc.nextInt();
          }
            play(arr);
            
        }
        
        
    }
