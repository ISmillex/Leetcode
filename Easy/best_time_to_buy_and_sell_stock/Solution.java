public class Solution {

    public int maxProfit(int[] prices) {
        int diffrence = 0;
        for (int i=0; i<prices.length; i++) {
            for (int j=i+1; j<prices.length; j++) {
                if (prices[i] < prices[j] && diffrence < prices[j] - prices[i])
                    diffrence = prices[j] - prices[i];
            }
        }

        return diffrence;
    }
    public static void main(String[] args) {
        Solution s = new Solution();

        int[] list = new int[] {7,1,5,3,6,4};
        System.out.println(s.maxProfit(list));
    }
}