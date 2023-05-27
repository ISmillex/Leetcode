

public class SearchInsertPosition {
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1,3,5,6}, 2));
    }

    public static int searchInsert(int[] nums, int target) {

        return bs(nums, target, 0, nums.length-1);

    }


    private static int bs(int[] arr, int target, int left, int right) {

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