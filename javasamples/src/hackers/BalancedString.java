package hackers;

import java.util.Stack;

public class BalancedString {

	public static void main(String[] args) {
		String str="(){}";
		if(checkBalancedString(str))System.out.println("Balanced String");
		else System.out.println("Not A Balanced String");
	}
	
	private static boolean checkBalancedString(String str) {
			Stack<Character> stack=new Stack<Character>();
			for(char ch:str.toCharArray()) {
				switch(ch) {
					case '(':
					case '[':
					case '{':
						stack.push(ch);
						break;
					case ')':
						if(stack.isEmpty() || '('!=stack.pop())
							return false;
						break;
					case ']':
						if(stack.isEmpty() || '['!=stack.pop())
						return false;
					break;
					case '}':
						if(stack.isEmpty() || '{'!=stack.pop()) 
							return false;
						break;
				}
			}
		return stack.isEmpty();
	}
}
