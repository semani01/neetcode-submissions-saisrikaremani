class Solution {
    public int missingNumber(int[] nums) {
        //Find sum of 0 to nums.length
        //Then calc. sum of each ele in nums
        //Our missing number = total range sum - actaul sum

        int totalSum = 0;
        for(int num = 0; num <= nums.length; num++){
            totalSum += num;
        }

        int actualSum = 0;
        for(int num : nums){
            actualSum += num;
        }

        return totalSum - actualSum;
    }
}
