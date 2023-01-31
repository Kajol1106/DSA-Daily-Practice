import java.util.*;
class collection_in_java{
    
  public void printList(List<Integer> list){
      // write your code here
      for(int i=0;i<list.size();i++){
           System.out.println(list.get(i));
      }
  }
  public List<Character> createList(int n,String str){
      // write your code here
      List<Character>list=new ArrayList();
      
      for(int i=0;i<n;i++){
          list.add(str.charAt(i));
      }
      return list;
  }
}