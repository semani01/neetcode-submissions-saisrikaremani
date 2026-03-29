class Solution {
    public int climbStairs(int n) {
        n += 1;
        int secondLast = 0, last = 1, fib = 0;
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else{
            for(int i = 2; i <= n; i++){
                fib = secondLast + last;
                secondLast = last;
                last = fib;
            }
            return fib;
        }
    }
}
