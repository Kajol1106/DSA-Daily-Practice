//Enter code here
import java.util.*;

class Main{
    
    
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        
        int tc=sc.nextInt();
        
        while(tc--!=0){
            int n=sc.nextInt();
            String str=sc.next();
            
            for(int i=0;i<n;i++){
                String bag="";
                for(int j=i;j<n;j++){
                    bag+=str.charAt(j);
                    System.out.println(bag);
                }
            }
            
        }
        
        
    }
    
}