import java.util.HashMap;

public class ClimbingStairs {
    HashMap<Integer, Integer> memo = new HashMap<>();

    public int climbStairs(int n) {

        if (n < 2) return 1;

        if (memo.containsKey(n)) return memo.get(n);
    
        else {
            int res = climbStairs(n-2) + climbStairs(n-1);
            memo.put(n, res);
            return res;
        }   

    }

    public static void main(String[] args) {
        ClimbingStairs c = new ClimbingStairs();
        System.out.println(c.climbStairs(44));
    }
}