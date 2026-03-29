class Solution {
    public int findDuplicate(int[] nums) {
        //Brute Force: maintain a hash set to check for uniqueness --> runs in O(n) time but O(n) space
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            if(set.contains(nums[i])){
                return nums[i];
            }

            set.add(nums[i]);
        }

        return -1;
    }
}
