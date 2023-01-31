import java.util.Arrays;
class song{
    String name; // This indicates the name of the song
   int duration; // This indicates the duration of the song
   int popularity;
   song(int duration ,String name,int p){
       this.name=name;
       this.duration=duration;
       this.popularity=p;
   }
  // complete the class as mentioned in the problem statement above
}

class chartlist{
    
    int n; // this indicates the size of the song array
   song[] arr;
   
   chartlist(int n,song[]arr){
    this.n=n; // this indicates the size of the song array
     this.arr= arr;
  // complete the class as mentioned in the problem statement above
        }
        void sortList(){
    
    for(int i = 0; i < arr.length-1; i++){
       for(int j = 0; j < arr.length-1-i; j ++){
           if(arr[j].popularity >arr[j+1].popularity){
               song temp = arr[j];
               arr[j] = arr[j+1];
               arr[j+1] = temp;
           }
       }
    }
    };
        
        String[] top_five(){
            sortList();
            String[]str=new String[5];
            
            for(int i=0;i<5;i++){
                str[i]=arr[i].name;
            }
              
             return str;
        };
   String leastPopular(){
       return arr[arr.length-1].name;
   }
   String mostPopular(){
       return arr[0].name;
   }
   String longestSong(){
       
       int l=0;
       String s="";
       for(int i=0;i<arr.length;i++){
           if(arr[i].duration>l){
               l=arr[i].duration;
               s=arr[i].name;
           }
       }
       //System.out.println(arr);
       return s;
   }
   String shortestSong(){
       int l=Integer.MAX_VALUE;;
       String s="";
       for(int i=0;i<arr.length;i++){
           if(arr[i].duration<l){
               l=arr[i].duration;
               s=arr[i].name;
           }
       }
       return s;
       
   }
   
  // complete the class as mentioned in the problem statement above
}
 Overview
 Announcements
 Problems
 Submissions
 Rankings

