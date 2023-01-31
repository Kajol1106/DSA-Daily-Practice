import java.util.*;

class Main{
    
   static void  play(int s,Integer[] arr){

        
        Arrays.sort(arr,(a,b)->{
            int n=Math.abs(a);
            n=(int)(Math.sqrt(n));
            int n1=Math.abs(b);
            n1=(int)(Math.sqrt(n1));
            if(n>n1){
                return 1;
            }else if(n<n1){
                return -1;
            }else{
                return a-b;
            }
        });
           
//  Arrays.sort(arr,(a,b)->{
     
//      int x=(int)Math.sqrt(Math.abs(a));
//      int y=(int)Math.sqrt( Math.abs(b));
     
//      if(x>y){
//          return 1;
//      }else if(x<y){
//          return -1;
//      } else{
         
//          return a-b;
//      }
     
     
//  });
        
        for(int i=0;i<s;i++){
            
            System.out.print(arr[i]+" ");
            
        }
     System.out.println();
       // System.out.println(Arrays.toString(arr));
       
        
       
   };
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        
        while(tc--!=0){
            int n=sc.nextInt();
            Integer[]arr=new Integer[n];
            
            for(int i =0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            play(n,arr);
        }
    }
}