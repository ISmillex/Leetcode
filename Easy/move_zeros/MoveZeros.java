import java.util.Arrays;

public class MoveZeros {

    public void moveZeroes(int[] nums) {
        int j=0;
        for(int i=0; i<nums.length; i++) {
            if (nums[i] != 0 && nums[j] == 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }

            if (nums[j] != 0) 
                j++; 
        }
    }

    

    

    public static void main(String[] args) {
        MoveZeros m = new MoveZeros();
        
        int[] nums = new int[] {0,1,0,3,12};
        m.moveZeroes(nums);

        System.out.println(Arrays.toString(nums));
    }
}