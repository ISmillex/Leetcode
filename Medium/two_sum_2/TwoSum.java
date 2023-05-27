import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        TwoSum t = new TwoSum();
        System.out.println(Arrays.toString(t.twoSum(new int[] {-1,0}, -1)));
    }

    public int[] twoSum(int[] numbers, int target) {
        if (0 < numbers.length) {
            for (int i=0, j=numbers.length-1; i<numbers.length; i++, j--) {
                if (numbers[i] + numbers[j] == target)
                    return new int[]{i+1, j+1};
                else if (numbers[i] + numbers[j] > target)
                    i--;
                else if (numbers[i] + numbers[j] < target)
                    j++;
            }
        }
        return new int[2];
    }
}