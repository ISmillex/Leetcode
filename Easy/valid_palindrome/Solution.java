public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.isPalindrome("race a car"));
    }

    public boolean isPalindrome(String s) {

        if (s.isEmpty()) return true;

        s = s.toUpperCase();
        StringBuilder str = new StringBuilder();
        for (int i=0; i<s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                str.append(s.charAt(i));
            }
        }
        for (int i=0, j=str.length()-1; i<str.length(); i++, j--) {
            if (str.charAt(i) != str.charAt(j))
                return false;
        }
        return true;
    }
}