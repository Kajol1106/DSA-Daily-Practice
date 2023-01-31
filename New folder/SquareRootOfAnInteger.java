import java.util.*;

class Main{
    
    
    public static void main(String[]args){
       
       Scanner sc=new Scanner(System.in);
       int tc=sc.nextInt();
       while(tc--!=0){
        int n=sc.nextInt();
        int l=1;
        int h=n;
     
       while(l<=h){
          
          int mid= l+(h-l)/2;
           
            if(mid<=n/mid)
            
               l=mid+1;
              
           else
           
            h=mid-1;
           
           
           
       }
          System.out.println(h);
       
    }
    
    }
    
}
