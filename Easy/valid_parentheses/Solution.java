import java.util.Stack;

public class Solution {
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.isValid("([{}])"));
	}

	public boolean isValid(String str) {
		Stack<Character> stack = new Stack<Character>();
		for (int i=0; i<str.length(); i++) {
			char bracket = str.charAt(i);
			switch(bracket) {
				case '(': stack.push(bracket); break;
				case '[': stack.push(bracket); break;
				case '{': stack.push(bracket); break;

				case ')': if (stack.isEmpty() || stack.pop() != '(') {return false;} break;

				case ']': if (stack.isEmpty() || stack.pop() != '[') {return false;} break;

				case '}': if (stack.isEmpty() || stack.pop() != '{') {return false;} break;
			}
		}

		return stack.isEmpty();
	}	
}