package Easy.palindrome_number;

public class PalindromeNumber {
  public static void main(String[] args) {
    int x = 12345;

    boolean res = solution(x);

    System.out.println(res);
  }

  static boolean solution(int x) {
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
