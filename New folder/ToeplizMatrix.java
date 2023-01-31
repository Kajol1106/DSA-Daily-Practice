//Enter code here
import java.util.*;
class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tc =sc.nextInt();
        while(tc-- !=0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int[][] mat = new int[n][m];
            for(int i=0; i<n; i++){
                 for(int j=0;j<m;j++){
                     mat[i][j]=sc.nextInt();
                 }
            }
            chess(mat,n,m);
        }
    }
    public static void chess(int[][] mat,int n,int m){
      
       boolean flag = true;
      for (int i=0;i<n-1;i++) {
        for (int j=0; j<m-1; j++) {
            
          if (mat[i][j] != mat[i + 1][j + 1]) {
            flag = false;
            break;
          }
        }
      }

    
  
        System.out.println(flag?"YES":"NO");
   }

    }
