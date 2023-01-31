//Enter code here
 //Enter code here
 import java.util.*;

 class Main{
     
     static void play(String str){
         
         if(str.length()==0){
             
             return;
         }
         
         int mid=(str.length()-1)/2;
         
         System.out.print(str.charAt(mid));
         
         String l="";
         String r="";
         
         for(int i=0;i<mid;i++){
             
           l+=str.charAt(i);
           
             
             
         }
         
         for(int i=mid+1;i<str.length();i++){
             
             r+=str.charAt(i);
         }
         
         play(l);
         play(r);
     }
     
      public static void main(String[]args){
          
          Scanner sc=new Scanner(System.in);
          int tc=sc.nextInt();
          
          for(int i=0;i<tc;i++){
              
          
          
          int n=sc.nextInt();
          String str=sc.next();
           
          play(str);
          System.out.println();
          }
      }
     
 }