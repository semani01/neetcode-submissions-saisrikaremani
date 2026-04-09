class Solution {
    public int singleNumber(int[] nums) {
        //Simple XOR operation
        //Two integers XOR cancel each other out
        //Our single integer will remain 

        int res = 0;
        for(int num : nums){
            res ^= num;  //xor operation
        }

        return res;
    }
}
