import java.util.*;
class Main {
    
    public static void main(String[] args){
        Scanner sc=  new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- !=0){
            int n=sc.nextInt();
            String arr=sc.next();
            sqRootSorting(arr,n);
        }
    }
    public static void sqRootSorting(String  str ,int n){
        
        Map<Character,Integer> map=new LinkedHashMap();
        
        for(int i=0;i<n;i++){
            
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }else{
                
                if(map.size()>0){
                    
                    System.out.print(str.charAt(i-1)+""+map.get(str.charAt(i-1)));
                    map.remove(str.charAt(i-1));
                }
                
                map.put(str.charAt(i),1);
            }
        }
        System.out.print(str.charAt(n-1)+""+map.get(str.charAt(n-1)));
        
        System.out.println();
       
    }
}
