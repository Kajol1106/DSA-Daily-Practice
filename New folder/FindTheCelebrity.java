//Enter code here
import java.util.*;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        
        while(tc--!=0){
            
        
        int n=sc.nextInt();
        
        int[][]arr=new int[n][n];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
         rotate(arr,n)   ;
    }
    }
    
    public static void rotate(int[][] mat,int n){
        
             
            for(int i=0; i<n; i++){
                
                boolean flag=true;
                for(int j = 0; j<n; j++){
                    
                    if(mat[i][j]==1){
                        flag=false;
                        break;
                    }
                }
                if(flag){
                    System.out.println(i);
                    return;
                }

            }
            
            System.out.println(-1);
    
    }
    
}
