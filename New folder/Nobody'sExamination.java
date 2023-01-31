import java.util.*;


class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int     n = sc.nextInt();
        int     k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        
        play(arr,n,k);
    }
    
    public static void play(int[] arr,int n,int k){
        
        int c=0;
        int b=0;
        
        for(int i=0;i<n;i++){
            
            if(arr[i]>k){
                b++;
                continue;
            }
            
            if(b>1){
                break;
            }
            c++;
            
        }
        System.out.println(c);
    }
}