class Solution {
    public int climbStairs(int n){
        if(n == 1)
        {
            return 1;
        }

        if(n == 2)
        {
            return 2;
        }

        int previous1 = 1;
        int previous2 = 2;
        int ways = 0;

        for(int i = 3; i <= n; i++)
        {
            ways = previous1 + previous2;

            previous1 = previous2;
            previous2 = ways;
        }

        return ways;
    }
}
 