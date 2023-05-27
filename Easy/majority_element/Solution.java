import java.util.HashMap;

public class Solution {

    public int majorityElementBasic(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<nums.length; i++) {
            int currNum = nums[i];
            if (!map.containsKey(currNum)) map.put(currNum, 1);
            else {
                int val = map.get(currNum);
                map.put(currNum, ++val);
            }
        }

        int max = 0, num = 0;
        for (Integer key: map.keySet()) {
            int val = map.get(key);
            if (val > nums.length/2 && max < val) {
                max = val; num = key;
            }
        }

        return num;
    }


    public int majorityElement(int[] nums) {
        return 1;
    }



    public static void main(String[] args) {
        Solution s = new Solution();

        int[] nums = new int[] {3,2,3};
        System.out.println(s.majorityElementBasic(nums));
    }

}