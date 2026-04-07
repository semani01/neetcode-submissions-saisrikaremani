class Solution {
    private int[] memo = new int[46];

    public int climbStairs(int n) {
        //base case: if number of steps are 0 or 1
        if(n <= 2){
            return n;
        } 

        if (memo[n] != 0) return memo[n];

        //recursive case: forms a fibonacci sequence
        //Note: Memoization fixes the Time Limit Exceeded error
        return memo[n] = climbStairs(n - 1) + climbStairs(n - 2);
    }
}