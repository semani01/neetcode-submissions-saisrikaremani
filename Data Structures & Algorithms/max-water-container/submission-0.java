class Solution {
    public int maxArea(int[] heights) {
        int L = 0, R = heights.length-1;
        int maxArea = 0;

        //move both pointers while checking area
        while(L < R){
            int area = (R - L) * Math.min(heights[L], heights[R]);
            maxArea = Math.max(maxArea, area);

            if(heights[L] < heights[R]){
                L++;
            } else {
                R--;
            } 
        }

        return maxArea; 
    }
}
