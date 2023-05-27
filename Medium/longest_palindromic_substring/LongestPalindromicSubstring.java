public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {
        int max = 0;
        char beg_chr = ' ';
        String res = "";
        StringBuilder str = new StringBuilder("");
        StringBuilder rev_str = new StringBuilder("");
        
        for (int i=0; i<s.length(); i++) {
            int index = i;
            char curr = s.charAt(index);
            str.setLength(0);
            rev_str.setLength(0);
            do {
                beg_chr = s.charAt(i);
                curr = s.charAt(index);
                str.append(curr);
                rev_str.insert(0, curr);
                index++;
            } while((beg_chr != curr || str.length() == 1) && index < s.length()) ;

            if (max < str.toString().length() && str.toString().equals(rev_str.toString())) {
                max = str.toString().length();
                res = str.toString();
            }
        }

        return res;
    }


    public static void main(String[] args) {
        LongestPalindromicSubstring l = new LongestPalindromicSubstring();
        System.out.println(l.longestPalindrome("ccc"));
    }
}