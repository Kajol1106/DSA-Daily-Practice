//Enter code here
import java.util.*;

class Main{
    
    static void play(String str1,String str2){
        Set<Character>set=new HashSet();
        for(int i=0;i<str1.length();i++){
            set.add(str1.charAt(i));
           
            }
                 for(int j=0;j<str2.length();j++){
                if(set.contains(str2.charAt(j))){
                    System.out.println("YES"); 
                    return;
                }  
                }
                
        
            System.out.println("NO");
         
        
        
    }
    
    public static void main (String[] args){
        
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        
        while(tc--!=0){
            String str1=sc.next();
            String str2=sc.next();
            
            play(str1,str2);
        }
    }
}