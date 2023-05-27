package Easy.two_sums;

import java.util.Arrays;

public class TwoSums {
  public static void main(String[] args) {

    int[] nums = new int[] {2,7,11,15};
    int target = 26;

    int[] res = solution(nums, target);

    System.out.println(Arrays.toString(res));

  }

  static int[] solution(int[] nums, int target) {
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
