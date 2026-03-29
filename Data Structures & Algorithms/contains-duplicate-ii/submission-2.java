class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> window = new HashSet<>();
        int L = 0;

        for(int R = 0; R < nums.length; R++){
            if(k == 0){
                return false;
            }
            
            if(window.contains(nums[R])){
                return true;
            }
            
            if(R - L + 1 > k){
                window.remove(nums[L]);
                L++;
            }

            window.add(nums[R]);
        }
        return false;
    }
}