import java.util.*;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int n =sc.nextInt();
        String str=sc.next();
        
        Map<Character,Integer>map=new TreeMap();
        
        for(int i =0;i<n;i++){
            
            if(map.containsKey(str.charAt(i))){
                
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }else{
                map.put(str.charAt(i),1);
            }
        }
        
        for(Character c:map.keySet()){
            
            System.out.println(c+"-"+map.get(c));
        }
         
        
        
        
    }
    
    
    
}