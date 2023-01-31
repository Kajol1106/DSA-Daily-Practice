import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String keyBoard = sc.next();
        String str = sc.next();
        trackTypingSpeed(keyBoard, str);
    }
    
    
    public static void trackTypingSpeed(String keyBoard, String str) {
        int[] position = new int[26];
        for(int i=0; i<26; i++) {
            //set position of each character
            char ch = keyBoard.charAt(i);
            position[ch-'a'] = i;
        }
        
        int lastIndex = 0;
        int res = 0;
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            //to store index of the next character
            int destination = position[ch-'a'];
            
            //to store distance of current character from the next char
            int distance = Math.abs(destination-lastIndex);
            
            //update the res
            res += distance;
            
            //update the last position
            lastIndex = destination;
        }
        
        System.out.println(res);
    }
}