class Solution {
    public int longestConsecutive(int[] nums) {
        //1. Sort the array
        //2. Loop over; if duplicate skip
        //3. If nums[i] = nums[i - 1] + 1, increment res;
        //4. Maintain a global result and compare with res at end of each iter
        //5. Return globalRes

        //Handling edge case of empty or null or single-element array
        if(nums == null || nums.length == 0){
            return 0;
        } 
        if(nums.length == 1){
            return 1;
        }

        Arrays.sort(nums);
        int res = 0, globalRes = 0;

        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i - 1]){ //skipping duplicates
                continue;
            }
            if(nums[i] == nums[i - 1] + 1){
                res++;
                globalRes = Math.max(globalRes, res);
                continue;
            }

            res = 0;

        }

        return globalRes + 1;
    }
}
