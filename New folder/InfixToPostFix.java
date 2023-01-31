//Enter code here
import java.util.*;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        
        String str=sc.next();
        
        String newstr=play(str);
        
        System.out.println(newstr);
        
    }
    

	
	public static String play(String str){
	    
		String ans = "";
		ArrayDeque<Character> stack	= new ArrayDeque<Character>();
		for (int i = 0; i < str.length(); ++i) {
			char c = str.charAt(i);
			if (Character.isLetterOrDigit(c))
				ans += c;
			else if (c == '(')
				stack.push(c);
			else if (c == ')') {
				while (!stack.isEmpty()
					&& stack.peek() != '(') {
					ans += stack.peek();
					stack.pop();
				}
				stack.pop();
			}
			else{
				while (!stack.isEmpty()
					&& check(c) <= check(stack.peek())) {
					ans += stack.peek();
					stack.pop();
				}
				stack.push(c);
			}
		}
		while (!stack.isEmpty()) {
			if (stack.peek() == '(')
				return "";
			ans += stack.peek();
			stack.pop();
		}
		return ans;
	}
	
	
	public static int check(char ch){
	      switch(ch){
	          case '+':
	                return 1;
	          case '-': 
	              
	                return 1;
	          case '*':
	              
	                return 2;
	          case '/':
	              
	                return 2;
	          case '^':
	              
	                return 3;
	         }
	     return -1;
}

}