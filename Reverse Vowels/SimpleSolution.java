import java.util.*;



/*
 * One simple solution is to store all the vowels while scanning the string and placing the vowels in the reverse order 
 * in another iteration of string. 
 * TC : O(n)
 * SC : O(v) v-> number of vowels
 */
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc--> 0) {
            String str = sc.next();
            reverseVowels(str);
        }
    }
    
    public static void reverseVowels(String str) {
        int j = 0;
        char[] c = str.toCharArray();
        String vowel = "";      //to store all vowels in string
        for(int i=0; i<c.length; i++) {
            if(isVowel(c[i])) {
                vowel += c[i];
                j++;
            }
        }
        
        //placing vowels in reverse order purpose
        for(int i=0; i<c.length; i++) {
            if(isVowel(c[i])) {
                c[i] = vowel.charAt(--j);
            }
        }
        
        System.out.println(String.valueOf(c));
    }
    
    public static boolean isVowel(char c) {
        boolean res = false;
        if(c=='a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' 
            || c=='u' || c=='U') {
            res = true;
        }
        return res;
    }
}