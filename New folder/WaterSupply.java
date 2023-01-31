import java.util.*;

class Main{
    
    static void play(int n,int m){
          for(int i=1;i<=n;i++){
         int ans=m/(i+1)+1+i;
         //System.out.print(ans);
         if(ans<=n){
             System.out.println("YES");
              return;
         }
         
     }
     System.out.println("NO");
    }
    public static void main(String[] args){
        
     Scanner sc=new Scanner(System.in);
     int tc=sc.nextInt();
     while(tc--!=0){
         
     
     int n=sc.nextInt();
     int m=sc.nextInt();
     play(n,m);
   
     
    }
}
}
