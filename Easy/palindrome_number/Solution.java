public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.isPalindrome(12345));
      }
    
      public boolean isPalindrome(int x) {
        if (x<0) return false;
    
        int reverse = 0;
        int copy = x;
    
        while(copy > 0) {
          int last_digit = copy % 10;
          reverse = reverse * 10 + last_digit;
          copy /= 10;
        }
        return reverse == x;
      }
      
}
