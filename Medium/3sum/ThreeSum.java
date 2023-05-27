import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        ThreeSum t = new ThreeSum();
        System.out.println(t.threeSum(new int[] {-1,0,1}));
    }

    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> res = new HashSet<>();
        Arrays.sort(nums);

        for (int p2=0; p2<=nums.length-2; p2++) {
            int p1 = p2+1;
            int p3 = nums.length-1;
            while (p1<p3) {
                int sum = nums[p1] + nums[p2] + nums[p3];
                if (sum == 0 ) {
                    res.add(Arrays.asList(nums[p1], nums[p2], nums[p3]));
                    p1++;
                } 
                else if (sum < 0) 
                    p1++;
                else
                    p3--;
            }
        }

        return new ArrayList<>(res);
    }
}