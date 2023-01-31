//Enter code here
import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner sc=  new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- !=0){
            int n=sc.nextInt();
            String str=sc.next();
            String str1=sc.next();
            
            sqRootSorting(n,str,str1);
        }
    }
    
    static boolean fun(Stack<Character>stack, Stack<Character> stack1){
        String s="";
        String s1="";
        for(int i=0;i<stack.size();i++){
             s+=stack.get(i);
        }
        
        for(int i=0;i<stack1.size();i++){
             s1+=stack1.get(i);
        }
        if(s.equals(s1)){
            return true;
        }else{
            return false;
        }
    }
    public static void sqRootSorting(int n,String str,String str1){
       
       Stack<Character> stack= new Stack();
       
       Stack<Character> stack1= new Stack();
       
       for(int i=0;i<n;i++){
           if(stack.size()>0&&str.charAt(i)=='#'){
               stack.pop();
           }else{
               stack.push(str.charAt(i));
           }
           if(stack1.size()>0&&str1.charAt(i)=='#'){
               stack1.pop();
           }else{
               stack1.push(str1.charAt(i));
           }
       }
       
        //System.out.println(stack+""+stack1);
        
        if(fun(stack,stack1)){
            System.out.println("CORRECT");
        }else{
            System.out.println("WRONG");
        };
       
    }
}
