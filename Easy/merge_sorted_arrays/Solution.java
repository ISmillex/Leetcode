import java.util.Arrays;

public class Solution {

    public void mergeBruteForce(int[] nums1, int m, int[] nums2, int n) {
        for (int i=m, j=0; i<m+n; i++, j++) {
            nums1[i] = nums2[j];
        }

        boolean swap;
        for (int j=0; j<nums1.length-1; j++) {
            swap = false;
            for (int k=0; k<nums1.length-j-1; k++) {
                if (nums1[k] > nums1[k+1]) {
                    int t = nums1[k];
                    nums1[k] = nums1[k+1];
                    nums1[k+1] = t;
                    swap = true;
                }
            }
            if (!swap) break;
        }
    }


    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1; 

        for (int k = nums1.length-1; k>i; k--) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            }
            else {
                nums1[k] = nums2[j];
                j--;
            }

        }
    }



    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums1 = new int[] {1,2,6,0,0,0};
        int[] nums2  = new int[] {2,5,6};
        s.merge(nums1, 3, nums2, 3);

        System.out.println(Arrays.toString(nums1));
    }
}