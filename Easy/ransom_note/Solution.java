import java.util.HashMap;

public class Solution {

    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character, Integer> magMap = new HashMap<>();

        for (int i=0; i<magazine.length(); i++) {
            if (!magMap.keySet().contains(magazine.charAt(i))) {
                magMap.put(magazine.charAt(i), 1);
            }
            else {
                int val = magMap.get(magazine.charAt(i));
                magMap.put(magazine.charAt(i), ++val);
            }
        }

        for (int i=0; i<ransomNote.length(); i++) {
            char chr = ransomNote.charAt(i);
            if (magMap.get(chr) != null && magMap.get(chr) > 0) {
                int val = magMap.get(chr);
                magMap.put(chr, --val);
            }
            else return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.canConstruct("aa", "aab"));
    }
}

