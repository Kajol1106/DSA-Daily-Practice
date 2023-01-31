//Enter code here
//Enter code here
import java.util.*;

class Main{
    
    static void play(int n,int m,int k,int[][] arr){
        
         int[]index=new int[n];
         
         for(int i=0;i<n;i++){
             index[i]=i;
         }
        
        int[]ans=new int[n];
        
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=0;j<m;j++){
                
                if(arr[i][j]==1){
                    c++;
                }
            }
            ans[i]=c;
        }
        
        
        for(int i=0;i<n-1;i++){
            
            for(int j=0;j<n-1-i;j++){
                
                if(ans[j]>ans[j+1]){
                    
                    swap(ans,j,j+1);
                    swap(index,j,j+1);
                }
                
            }
        }
        
        for(int i=0;i<k;i++){
            System.out.print(index[i]+" ");
        }
        
        
        
        
    }
    
    static void swap(int[]arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
      
        
        
            
            int n=sc.nextInt();
            int m=sc.nextInt();
            int k=sc.nextInt();
            int[][] arr=new int[n][m];
            
            for(int i=0;i<n;i++){
                
                for(int j=0;j<m;j++){
                   arr[i][j]=sc.nextInt(); 
                }
            }
            play(n,m,k,arr);
        }
    }
