//Enter code here
import java.util.*;

class Main{
    
    public static void Bishop(String[][] arr){
        
        boolean flag=false;
       int temp=0;
       for(int i=0;i<8;i++){
           int c=0;
           for(int j=0;j<8;j++){
               if(arr[i][j].equals("#")){
                   c++;
                   temp=j;
               }
           }
           if(c==2){
               flag=true;
           }
           if(c==1&&flag==true){
               
               System.out.println((i+1)+" "+(temp+1));
               break;
           }
       }
        
         
    }
    
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        
        while(tc--!=0){
            
            String[][]arr=new String[8][8];
           
           for(int i=0;i<8;i++){
               arr[i]=sc.next().split("");
           } 
            
            
          Bishop(arr);  
        }
    }
    
    
}
