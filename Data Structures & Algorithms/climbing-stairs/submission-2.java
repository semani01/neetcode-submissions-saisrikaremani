class Solution {
    public int climbStairs(int n) {
        n += 1;
        int []cache = new int[n + 1];

        int ways = climbStairsHelper(n, cache);

        return ways;
    }

    public int climbStairsHelper(int n, int []cache){
        if(n <= 1)
            return n;
        
        if(cache[n] != 0)
            return cache[n];

        cache[n] = climbStairsHelper(n - 1, cache) + climbStairsHelper(n - 2, cache);
        return cache[n];
    }

}
