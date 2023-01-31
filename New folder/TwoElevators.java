//Enter code here
//Enter code here
import java.util.*;


class Main {
    
    public static void main(String []args){
        
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        while(tc--!=0){
          int n1=sc.nextInt();
          int n2=sc.nextInt();
          int n3=sc.nextInt();
          
          
          int ans=Math.abs(n2-n3)+n3;
          
          if(n1<ans){
              System.out.println(1);
          }
          else if(n1>ans){
              System.out.println(2);
          }
          else{
              System.out.println(3);
          }
        
 }
 }
}