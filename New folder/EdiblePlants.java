//Enter code here
import java.util.*;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt();
        String str1=sc.next();
        
        int m=sc.nextInt();
        String str2=sc.next();
        
        int c=0;
        
        for(int i=0;i<n;i++){
            
            for(int j=0;j<m;j++){
                if(str1.charAt(i)==str2.charAt(j)){
                    c++;
                }
            }
            
        }
        
        System.out.println(c);
        
    }
}