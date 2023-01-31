//Enter code here
import java.util.*;

class Main{
    
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n-1][2];
        
        for(int i=0; i<n-1; i++){
            
            for(int j=0; j<2; j++){
                
                matrix[i][j] = sc.nextInt();
            }
        }
        play(matrix);
        
    }
    
    public static void play(int[][] mat) {
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int[] arr : mat) {
            
            map.put(arr[0], map.getOrDefault(arr[0], 0) + 1);
            map.put(arr[1], map.getOrDefault(arr[1], 0) + 1);
            
        }
        
        for (int k : map.keySet()) {
            
            if (map.get(k) == mat.length) {
                
               System.out.println(k);
               
               return;
            }
        }
        
         System.out.println(-1);
    }
}

