import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner sc=  new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- !=0){
            int n=sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i]=sc.nextInt();
            }
             abhi(arr,n);
        }
    }
    public static void abhi(int[] arr ,int n){
       
       Map<Integer,Integer> map= new LinkedHashMap();
       
       for(int i=0;i<n;i++){
           if(map.containsKey(arr[i])){
               
               map.put(arr[i],map.get(arr[i])+1);
           }else{
               map.put(arr[i],1);
           }
       }
       
       for(Integer i:map.keySet()){
           if(map.get(i)==1){
              System.out.println(i);
                return;
           }
       }
      
       
    }
}
