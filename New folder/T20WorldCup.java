class Pair{
    String name;
    int points;
    Pair(String name, int points){
        this.name = name;
        this.points = points;
    }
    void print(){
        System.out.println(this.name + "->" + this.points);
    }
  }
  
  class worldCup{
      int numberOfTeams;
      Pair[] arr;
      
      worldCup(int numberOfTeams, Pair[] pair){
          this.numberOfTeams = numberOfTeams;
          this.arr = pair;
      }
      
      void printLeaderBoard() {
          sortList();
          for(Pair p :arr){
              p.print();
          }
      }
  void sortList(){
      
      for(int i = 0; i < arr.length; i++){
         for(int j = 0; j < arr.length-1; j ++){
             if(arr[j].points < arr[j+1].points){
                 Pair temp = arr[j];
                 arr[j] = arr[j+1];
                 arr[j+1] = temp;
             }
         }
      }
      
  }
  String[] qualified(){
      sortList();
      String[] result = {arr[0].name,arr[1].name};
      return result;
  } 
  String[] disqualified(){
      sortList();
      String[] result = new  String[arr.length-2];
      int j = 0;
      for(int i = 2; i < arr.length; i++){
          result[j] = arr[i].name;
          j=j+1;
      }
      return result;
  }
  
  }