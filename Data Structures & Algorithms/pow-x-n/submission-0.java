class Solution {
    public double myPow(double x, int n) {
        double res = 1;
        long absN = Math.abs((long)n);

        for(long i = 1; i <= absN; i++){
            res *= x;
        }

        return n < 0 ? 1 / res : res;
    }
}