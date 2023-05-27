import java.util.Arrays;

public class Solution {
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
	}

	public int removeDuplicates(int[] nums) {
		int i = 0;
 		for(int j=0; j<nums.length; j++) {
 			if (nums[i] != nums[j]) {
 				i++;
 				nums[i] = nums[j];
 			}
 		}
 		return i+1;
	}

}

