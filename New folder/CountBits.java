//Enter code here
import java.util.*;

class Main{
    static void play(int n){
        
          
        
         for(int i=0;i<=n;i++){
             
              int s=sum(Integer.toBinaryString(i));
                
               System.out.print(s+" "); 
            }
            System.out.println();
    }
    
    static int sum(String str){
        int num=Integer.parseInt(str);
        int s=0;
        
        while(num>0){
            int a=num%10;
            s+=a;
            num=num/10;
        }
        return s;
    }
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        
        while(tc--!=0){
            
            int n=sc.nextInt();
            
           play(n);
            
        }
        
    }
}