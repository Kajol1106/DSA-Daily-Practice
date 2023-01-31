//Enter code here
import java.util.*;

 
class Main{
    
    public static void main(String[]args){
        
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        List<List<String>>list=new ArrayList();
        sc.nextLine();
        while(n--!=0){
            
            List<String>list1=Arrays.asList(sc.nextLine().split(" "));
            list.add(list1);
        }
        // System.out.println(list);
        Collections.sort(list,(l1,l2)->{
            
        //      if(l1.get(1).equals(l2.get(1))){
            
        //     return l1.get(0).compareTo(l2.get(0));
        // }else{
            
            if(Integer.parseInt(l1.get(1))>Integer.parseInt(l2.get(1))){
                return -1;
            }else if(Integer.parseInt(l1.get(1))<Integer.parseInt(l2.get(1))) {
               return 1;
            }else{
               return l1.get(0).compareTo(l2.get(0)); 
            }
        
            
        });
        //System.out.println(list);
 
        int j=1;
            String prev=" ";
     int  rank=1;
     int  count=0;
      for(int i=0;i<list.size();i++){
           if(list.get(i).get(1).equals(prev)){
             System.out.println(rank+" "+list.get(i).get(0)); 
             
          
           }else{
               rank+=count;
              System.out.println(rank+" "+list.get(i).get(0)); 
                count=0;
           }
         count++;
         prev=list.get(i).get(1);
      }
 
    
    }
}