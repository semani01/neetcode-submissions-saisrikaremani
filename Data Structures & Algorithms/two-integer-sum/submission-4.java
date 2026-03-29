class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int []indices = new int[2];
        for(int i = 0; i < nums.length; i++){
            int difference = target - nums[i];
            if(hm.containsKey(difference))
                return new int[] {hm.get(difference), i};
            hm.put(nums[i], i);
        }
        return new int[] {};
    }
}
