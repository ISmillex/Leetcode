import java.util.HashMap;


public class Solution {

    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<nums.length; i++) {
            int curr = nums[i];
            if (!map.containsKey(curr)) map.put(curr, 1);
            else {
                int val = map.get(curr);
                map.put(curr, ++val);
            }
        }

        for (int i=0; i<nums.length; i++) {
            if (map.get(nums[i]) == 1) return nums[i];
        }

        return 1;
    }
    public static void main(String[] args) {
        Solution s = new Solution();

        int[] nums = new int[] {4,1,2,1,2};
        System.err.println(s.singleNumber(nums));
    }
}