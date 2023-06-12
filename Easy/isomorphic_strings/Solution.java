import java.util.HashMap;

public class Solution {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.isIsomorphic("foo", "bar"));
    }

    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();

        for (int i=0; i<s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                if( map.containsValue(t.charAt(i)) )
                    return false;
                map.put(s.charAt(i), t.charAt(i));
            }
            else if ( map.get(s.charAt(i)) != t.charAt(i) && !map.containsKey(t.charAt(i)) )
                return false;
        }
        return true;
    }
}