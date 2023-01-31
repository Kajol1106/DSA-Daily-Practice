import java.util.*;
import java.util.HashMap;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        alanAndFrequency(n, str);
    }
    
    public static void alanAndFrequency(int n, String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++) {
            if(map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), map.get(str.charAt(i))+1);
            }
            else {
                map.put(str.charAt(i), 1);
            }
        }
        
        
        for(Character s: map.keySet()) {
            System.out.println(s+"-"+map.get(s));
        }
        
    }
}