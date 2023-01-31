import java.io.*;
import java.lang.*;
import java.util.*;

class Main{
    
  public static int glMaxima(String[] a){
    int max_per_day = 0;
    int total_max = 0;
    int max = 0;
    int count = 0;
    for (int i=0;i<a.length;i++){
      for (int j=0;j<a[i].length();j++){
        if (a[i].charAt(j) == 'C') count++;
        else{
          max = Math.max(max,count);
          count = 0;
        }
      }
    }
    max = Math.max(max,count);
    return max;
  }
  public static int Maxima(String[] a){
    int count = 0;
    int max = 0;
    for (int i=0;i<a.length;i++){
      for (int j=0;j<a[i].length();j++){
        if (a[i].charAt(j) == 'C') count++;
        else{
          max = Math.max(max,count);
          count = 0;
        }
      }
      max = Math.max(max,count);
      count = 0;
    }
    return max;
  }
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    String[] a = new String[n];
    for (int i=0;i<a.length;i++){
      a[i] = s.nextLine();

    }
    int local = Maxima(a);
     int global = glMaxima(a);
      System.out.println(local + " " +global);
}
}
