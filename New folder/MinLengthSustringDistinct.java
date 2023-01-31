import java.util.*;
 class Main{
     
     public static void main(String[]args){
         
         Scanner sc=new Scanner(System.in);
         String str=sc.next();
         play(str);
     }
     
     static boolean check(String bag,String sub){
         String flag="";
          for(int k=0;k<bag.length();k++){
               
               for(int l=0;l<sub.length();l++){
                   
                 if(bag.charAt(k)==sub.charAt(l)){
                     
                      flag+=bag.charAt(k);
                       break;
                      
                 }  
                   
               }
               
           }
           if(flag.equals(bag)){
               return true;
           }else{
               return false;
           }
     }
     
     static void play(String str){
         
         Set<Character>set=new HashSet();
         
         for(int i=0;i<str.length();i++){
             set.add(str.charAt(i));
             
         }
         String bag="";
         
         
         for(Character c:set){
             bag+=c;
         }
         
         int max=Integer.MAX_VALUE;
         for(int i=0;i<str.length();i++){
           String sub="";
           for(int j=i;j<str.length();j++){
               sub+=str.charAt(j);
           if(sub.length()>=bag.length()){
           
           if(check(bag,sub)){
               if(max>sub.length()){
                   max=sub.length();
               }
               //System.out.println(sub);
           }
               
           }
            
           }
         }
         System.out.println(max);
         
     }
     
     
     
     
     
     
     
 }
