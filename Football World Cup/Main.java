import java.util.*;

class Pair{
  int wins;
    String name;
    
   // write the constructor as mentioned in the problem statement
   Pair(int wins, String name) {
       this.wins = wins;
       this.name = name;
   }
}

class footballWorldCup{
  int n = 32;
  Pair[] arr;
  
  // complete the class as mentioned in the problem statement
  footballWorldCup(Pair[] arr) {
      this.arr = arr;
  }
  
  String[] topSixteen() {
      sort();
      String[] res = new String[16];
      for(int i=0; i<16; i++) {
          res[i] = arr[i].name;
      }
      return res;
  }
  
  String[] topEight() {
      sort();
      String[] res = new String[8];
      for(int i=0; i<8; i++) {
          res[i] = arr[i].name;
      }
      return res;
  }
  
  String[] topFour() {
      sort();
      String[] res = new String[4];
      for(int i=0; i<4; i++) {
          res[i] = arr[i].name;
      }
      return res;
  }
  
  String[] topTwo() {
      sort();
      String[] res = new String[2];
      for(int i=0; i<2; i++) {
          res[i] = arr[i].name;
      }
      return res;
  }
  
  String winner() {
      sort();
      String[] res = new String[1];
      for(int i=0; i<1; i++) {
          res[i] = arr[i].name;
      }
      return res[0];
  }
  
  void sort() {
      for(int i=0; i<arr.length; i++) {
          for(int j=0; j<arr.length-1; j++) {
              if(arr[j].wins<arr[j+1].wins) {
                  Pair temp = arr[j];
                  arr[j] = arr[j+1];
                  arr[j+1] = temp;
              }
              else if(arr[j].wins == arr[j+1].wins) {
                  if(arr[j].name.compareTo(arr[j+1].name)>0) {
                      Pair temp = arr[j];
                      arr[j] = arr[j+1];
                      arr[j+1] = temp;
                  }
              }
          }
      }
  }
}
