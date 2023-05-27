

public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.searchInsert(new int[]{1,3,5,6}, 2));
    }

    public int searchInsert(int[] nums, int target) {

        return bs(nums, target, 0, nums.length-1);

    }


    private int bs(int[] arr, int target, int left, int right) {

        if (left > right) 
            return left;

        int mid = (right+left)/2;
      
        if (arr[mid] == target) 
            return mid;

        if (arr[mid] < target)
            return bs(arr, target, mid+1, right);
        
        else
            return bs(arr, target, left, mid-1);

    }
}