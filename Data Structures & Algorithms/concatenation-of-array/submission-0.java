class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        //creating new array with 2n length
        int ans[] = new int[n * 2];

        //run single loop --> perform two operations at once, filling 1st half and 2nd half of new array
        for(int i = 0; i < n; i++){
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }

        return ans;
    }
}