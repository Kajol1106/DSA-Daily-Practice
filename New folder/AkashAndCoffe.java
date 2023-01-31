//Enter code here
import java.util.*;


class Main {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k=sc.nextInt();
        int q=sc.nextInt();
        Map<Integer,Integer> map = new HashMap<>();
           for(int i = 0; i< n; i++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                for(int j = a; j<=b; j++){
                    if(map.containsKey(j)){
                        map.put(j,map.get(j)+1);
                    }else{
                        map.put(j,1);
                    }
                }
           }
           for(int i = 0; i< q; i++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = 0;
                for(int j = a; j<=b; j++){
                    if(map.containsKey(j) ){
                        if(map.get(j)>=k){
                            c++;
                        }
                    }
                }
                System.out.println(c);
 }  
    }
    
     
}