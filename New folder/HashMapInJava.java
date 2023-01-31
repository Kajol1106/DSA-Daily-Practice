// import TreeMap from the respective library
import java.util.*;
class collection_in_java{
    
  public TreeMap<Character,Integer> solve(int n, String str){
    // write your code here
    TreeMap<Character,Integer>map=new TreeMap();
    
    for(int i=0;i<n;i++){
        if(map.containsKey(str.charAt(i))){
            map.put(str.charAt(i),map.get(str.charAt(i))+1);
        }else{
            map.put(str.charAt(i),1);
        }
    }
    return map;
  }
}