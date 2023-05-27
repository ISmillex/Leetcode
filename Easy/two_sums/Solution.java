import java.util.Arrays;

public class Solution {
  public static void main(String[] args) {
    Solution s = new Solution();

    int[] res = s.two_sums(new int[] {2,7,11,15}, 26);
    System.out.println(Arrays.toString(res));

  }

  public int[] two_sums(int[] nums, int target) {
    for(int i=0; i<nums.length; i++) {
      for(int j=i+1; j<nums.length; j++) {
        if (nums[i] + nums[j] == target) {
          return new int[]  {i, j};
        }
      }
    }
    return new int[0];
  }
}
