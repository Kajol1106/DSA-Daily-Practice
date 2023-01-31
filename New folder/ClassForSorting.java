import java.util.Arrays;
import java.util.*;
class sorter_class{
    
   void sort(String[] arr){
        Arrays.sort(arr);
    }
    
   void sort(int[] arr){
        Arrays.sort(arr);
    }
    
 void sort(boolean[] arr) {
     
     boolean[]b=new boolean[arr.length];
     int j=0;
     for(int i=0;i<arr.length;i++){
         if(arr[i]==true){
             b[j++]=arr[i];
         }
     }
     for(int i=0;i<arr.length;i++){
         if(arr[i]==false){
             b[j++]=arr[i];
         }
     }
     for(int i=0;i<arr.length;i++){
         arr[i]=b[i];
     }
    // arr=b;
     
      
      
       
 
}


void sort(char[] arr){
    
 Arrays.sort(arr); 

}

    
    
  // complete the class as mentioned in the problem statemenent above
}
 Overview
 Announcements
 Problems
 Submissions
 Rankings
