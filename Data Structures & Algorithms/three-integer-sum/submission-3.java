class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++){
            if (i > 0 && nums[i] == nums[i-1]) continue;
            int L = i + 1, R = nums.length - 1;
            while(L < R){
                if(nums[L] + nums[R] < -nums[i]){
                    L++;
                } else if(nums[L] + nums[R] > -nums[i]){
                    R--;
                } else {
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[L]);
                    triplet.add(nums[R]);
                    list.add(triplet);    
                    while (L < R && nums[L] == nums[L + 1]) L++;
                    while (L < R && nums[R] == nums[R - 1]) R--;
                    L++;
                    R--;
                }
            }
        }
        return list;
    }
}