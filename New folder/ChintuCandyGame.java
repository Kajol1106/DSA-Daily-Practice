//Enter code here
import java.util.*;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        
        
        int tc =sc.nextInt();
        
        while(tc--!=0){
            
            
            int n=sc.nextInt();
            int sum=n;
            while(true){
             int a=n/10;
             sum+=a;
             n=n%10+a;
             if(n<10)
             break;
               
             }
             System.out.println(sum);
        }
    }
}