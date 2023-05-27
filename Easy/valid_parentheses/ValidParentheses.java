import java.util.Stack;

public class ValidParentheses {
	public static void main(String[] args) {
		System.out.println(isValid("([{}])"));
	}

	public static boolean isValid(String str) {
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