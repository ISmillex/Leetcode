public class PangramSentence {
    public static void main(String[] args) {
        System.out.println(isPangram("leetcode"));
    }

    public static boolean isPangram(String text) {
        final int LETTERS = 26;
        int[] list = new int[LETTERS];

        for(int i=0; i<text.length(); i++) {
            list[text.charAt(i)-'a']++;
        }
        for(int i=0; i<LETTERS; i++) {
            if(list[i] == 0)
                return false;
        }
        return true;
    }
}