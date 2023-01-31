//Enter code here
import java.util.*;

class Main{
    
    public static void Row(int[][] arr,int n,int m){
        
        Map<Integer,Integer> map=new LinkedHashMap();
        
        for(int i=0;i<n;i++){
            Map<Integer,Integer> map1=new LinkedHashMap();
            for(int j=0;j<m;j++){
               map1.put(arr[i][j],1);
            }
            for(Integer key:map1.keySet()){
                if(map.containsKey(key)==false){
                    map.put(key,1);
                }else{
                    map.put(key,map.get(key)+1); 
                }
            }
        }
        int c=0;
        for(Integer i:map.keySet()){
            if(map.get(i)==n){
                c++;
            }
        }
        
        System.out.println(c);
        
    };
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int tc=sc.nextInt();
        
        while(tc--!=0){
            
            int n=sc.nextInt();
            int m=sc.nextInt();
            
            int[][]arr=new int[n][m];
            
            for(int i=0;i<n;i++){
                
                for(int j=0;j<m;j++){
                    
                    arr[i][j]=sc.nextInt();
                }
            }
            
           Row(arr,n,m);  
        }
    }
}
