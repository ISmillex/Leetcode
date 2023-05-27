import java.util.HashSet;


public class Solution {

    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 1) return 1;
        int max = 0;
        HashSet<Character> set = new HashSet<>();
        for (int i=0; i<s.length(); i++) {
            if (!set.contains(s.charAt(i))) {
                set.add(s.charAt(i));
                max = Math.max(max, set.size());
            }
            else {
                i = i - set.size();
                set.clear();
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.lengthOfLongestSubstring("pwwkew"));
    }
}