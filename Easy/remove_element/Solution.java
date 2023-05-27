public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.removeElement(new int[]{0,1,2,2,3,0,4,2}, 2));
    }


    public int removeElement(int[] nums, int val) {
        int j=0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] == val) {
                continue;
            }
            nums[j] = nums[i];
            j++;
        }
        return j;
    }
}