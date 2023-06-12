import java.util.HashMap;

class Solution {

    public static void main(String[] args) {
        Solution s= new Solution();
        System.out.println(s.wordPattern("aaaa", "dog cat cat do"));
    }


    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        HashMap<Character, String> map = new HashMap<>();

        if (arr.length != pattern.length())
            return false;

        for (int i=0; i<pattern.length(); i++) {
            if (!map.containsKey(pattern.charAt(i))) {
                if (map.containsValue(arr[i]))
                    return false;
                map.put(pattern.charAt(i), arr[i]);
            }
            else if (!map.get(pattern.charAt(i)).equals(arr[i])) {
                return false;
            }
        }

        return true;
    }
}