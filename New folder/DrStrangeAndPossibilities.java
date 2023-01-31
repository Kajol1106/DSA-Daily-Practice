//Enter code here
import java.util.*;

class Main{
    
    static List<Integer> list= new ArrayList<>();
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=i+1;
        }
        play(arr ,0);
    }
    
    public static void play(int[] arr,int index){
        
        System.out.println(list.toString().replace("[","").replace("]","").replace(",",""));
        
        if(index==arr.length)return;
        
        for(int i=index;i<arr.length;i++){
            
            list.add(arr[i]);
            play(arr,i+1);
            list.remove(list.size()-1);
 
            
        }
  }
}