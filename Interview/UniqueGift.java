import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc--> 0) {
            String str = sc.next();
            uniqueGift(str);
        }
    }
    
    public static void uniqueGift(String str) {
        StringBuilder res = new StringBuilder();    //empty string for storing res
        Queue<Character> q = new LinkedList<>();    //empty queue
        HashSet<Character> map = new HashSet<>();
        for(int i=0; i<str.length(); i++) {
            if(map.contains(str.charAt(i))) {
                if(q.contains(str.charAt(i))) {
                    q.remove(str.charAt(i));
                }
            }
            //if it is not present in map and q add to both map and q
            else {
                map.add(str.charAt(i));
                q.add(str.charAt(i));
            }
            
            //if q is empty means no unique giftes is there. so append # to result
            if(q.isEmpty()) {
                res.append('#');
            }
            else {
                res.append(q.peek());   //appending first element from q to result
            }
            map.add(str.charAt(i)); //Once char is processed add element to set
        }
       System.out.println(res.toString()); 
    }
}