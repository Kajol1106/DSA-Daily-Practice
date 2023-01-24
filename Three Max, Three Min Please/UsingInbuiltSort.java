import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    HashSet<Integer> map = new HashSet<>();
    List<Integer> list = new ArrayList<>();
    for (int i=0;i<n;i++){
      int temp = sc.nextInt();
      if (!map.contains(temp)) {
          list.add(temp);
      }
      map.add(temp);
    }
    Collections.sort(list);
    if (list.size()<3){
      System.out.println("Not Possible");
      System.out.println("Not Possible");
    }
    else{
      for (int i=0;i<3;i++) {
          System.out.print(list.get(i) + " ");
      }
      System.out.println();
      for (int i=list.size()-3;i<list.size();i++) {
          System.out.print(list.get(i) + " ");
      }
    }
  }
}