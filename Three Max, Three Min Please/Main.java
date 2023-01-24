import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        threeMaxThreeMin(n, arr);
    }
    
    
    public static void threeMaxThreeMin(int size, int[] arr) {
        
        //for remove the duplicate element from array
        Set<Integer> set = new HashSet();
        for(int i: arr) {
            set.add(i);
        }
        
        //convert the set into array
        Integer[] array = set.toArray(new Integer[set.size()]);
        // for(Integer i: array) {
        //     System.out.print(i+" ");
        // }
        int n = array.length;
        
        //for sorting the 0, negative and positive numbers
        int temp = 0;
        boolean finished = false;
        do {
            finished = true; 
            for (int i=0; i<n-1; i++){
                if (array[i]>array[i+1]){
                    finished = false; 
                    temp = array[i]; 
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
        } while(!finished);

        //System.out.println(Arrays.toString(array));
        
        if(n<3) {
            System.out.println("Not Possible");
            System.out.println("Not Possible");
        }
        else {
            for(int i=0; i<3; i++) {
                System.out.print(array[i]+" ");
            }
            System.out.println();
            for(int i=n-3; i<n; i++) {
                System.out.print(array[i]+" ");
            }
        }
    }
}