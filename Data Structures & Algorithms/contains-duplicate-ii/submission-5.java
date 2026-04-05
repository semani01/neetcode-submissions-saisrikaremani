class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        int L = 0;

        for(int R = 0; R < nums.length; R++){
            //check if window size is valid
            if(R - L > k){
                set.remove(nums[L]);
                L++;
            }

            //check if set contains the integer at R
            if(set.contains(nums[R])){
                return true;
            }

            //encountering an element for the first time
            set.add(nums[R]);
        }

        return false; 
    }
}