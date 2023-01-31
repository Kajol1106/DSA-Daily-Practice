//Enter code here
import java.util.*;

class Main{
    
    static void play(int n,int m,String str1,String str2){
      String[]arr=str1.split(" ");
      String[]arr1=str2.split(" ");
        Map< String,Integer>map = new HashMap();
        
        
        for(int i =0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        
         for(int i =0;i<arr1.length;i++){
            if(map.containsKey(arr1[i])){
                map.put(arr[i],map.get(arr[i])-1);
            }else{
                System.out.println("No");
                return;
            }
        }
        
        for(String st:map.keySet()){
            if(map.get(st)<0){
                 System.out.println("No");
                return;
            }
        }
         
         
        System.out.println("Yes");
        
    }
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        sc.nextLine();
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        
        play(n,m,str1,str2);
    }
}
