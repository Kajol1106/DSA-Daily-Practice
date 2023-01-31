import java.util.*;
class Main {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int tc=sc.nextInt();
        while(tc-- !=0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            
            int[][] mat = new int[n][m];
            
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    mat[i][j]=sc.nextInt();
                }
            }
            int k=sc.nextInt();
            
            System.out.println(play(mat,n,m,k));
        }
        
        
    }
    public static boolean play(int[][] mat,int n,int m,int k){
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==k){
                    return true;
                }
            }
        }
        
        return false;
    }
    
}