import java.util.*;
  class Pair{
  int wins;
    String name;
    Pair(int wins,String name){
        this.wins = wins;
        this.name = name;
    }
   // write the constructor as mentioned in the problem statement
}

class footballWorldCup{
  int n = 32;
  Pair[] arr;
  footballWorldCup(Pair[] arr){
      this.arr = arr;
  }
  String[] topSixteen(){
      sort();
      String[] ans = new String[16];
      for(int i = 0; i < 16; i++){
          ans[i] = arr[i].name;
      }
      return ans;
  };
  String[] topEight(){
      sort();
      String[] ans = new String[8];
      for(int i = 0; i < 8; i++){
          ans[i] = arr[i].name;
      }
      return ans;
  };
  String[] topFour(){
      sort();
      String[] ans = new String[4];
      for(int i = 0; i < 4; i++){
          ans[i] = arr[i].name;
      }
      return ans;
  };
  String[] topTwo(){
      sort();
      String[] ans = new String[2];
      for(int i = 0; i < 2; i++){
          ans[i] = arr[i].name;
      }
      return ans;
  };
  String winner(){
      sort();
      String[] ans = new String[1];
      for(int i = 0; i < 1; i++){
          ans[i] = arr[i].name;
      }
      return ans[0];
  };
  
  void sort(){
           for(int i = 0; i < arr.length; i++){
       for(int j = 0; j < arr.length-1; j ++){
           if(arr[j].wins < arr[j+1].wins){
              Pair temp = arr[j];
               arr[j] = arr[j+1];
               arr[j+1] = temp;
           }
          else if(arr[j].wins == arr[j+1].wins){
              if(arr[j].name.compareTo(arr[j+1].name)>0){  
                      Pair temp1 = arr[j];
                      arr[j] = arr[j+1];
                      arr[j+1] = temp1;
                 }  
          }
        }
  }
}

  }