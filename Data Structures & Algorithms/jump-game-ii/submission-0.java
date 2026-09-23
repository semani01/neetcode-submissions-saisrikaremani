class Solution {
    public int jump(int[] nums) {
        int res = 0; //number of jumps used so far
        int l = 0, r = 0; //current window: all indices reachable using 'res' jumps

        //Keep expanding the window until the last index falls inside it
        while(r < nums.length - 1){
            //Find the single farthest index reachable from anywhere in the current window - this becomes the boundary of the next window
            int farthest = 0;
            for(int i = l; i <= r; i++){
                farthest = Math.max(farthest, i + nums[i]);
            }

            //Move to the next window: starts right after where old one ended, extends out to the farthest point we just found
            l = r + 1;
            r = farthest;

            //update res as we just used one more jump to reach this window
            res++;
        }

        return res;
    }
}