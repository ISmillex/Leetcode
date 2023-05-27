public class LongestCommonPrefix {
    public static void main(String[] args) {
        System.out.println(lcp(new String[]{"flower", "flow", "flight"}));
    }

    public static String lcp(String[] strs) {
        if (strs.length == 0)
            return "";

        int len = strs[0].length();
        for(int i=0; i<strs.length; i++) {
            if(strs[i].length() < len)
                len = strs[i].length();
            for(int j=0; j<len; j++) {
                char a = strs[0].charAt(j);
                char b = strs[i].charAt(j);
                if (a!=b)
                    len = j;
            }
        }
        return strs[0].substring(0, len);
    }
}