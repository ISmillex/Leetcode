public class IsSubsequence {
    public static void main(String[] args) {
        IsSubsequence s = new IsSubsequence();
        System.out.println(s.isSubsequence("abc", "ahbgdc"));
    }

    public boolean isSubsequence(String s, String t) {

        if (s.length() == 0) return true;

        int tp = 0;
        int sp = 0;

        while (tp<t.length()) {

            if (t.charAt(tp) == s.charAt(sp)) {
                sp++;
                if (sp == s.length()) return true;
            }
            tp++;
        }
        return false;
    }
}
