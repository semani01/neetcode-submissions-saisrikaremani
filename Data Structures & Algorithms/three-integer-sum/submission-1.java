class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++){
            if (i > 0 && nums[i] == nums[i-1]) continue;
            for(int j = i + 1; j < nums.length; j++){
                if (j > i + 1 && nums[j] == nums[j-1]) continue;
                for(int k = j + 1; k < nums.length; k++){
                    if (k > j + 1 && nums[k] == nums[k-1]) continue;
                    if(nums[i] + nums[j] + nums[k] == 0){
                        List<Integer> triplet = new ArrayList<>();
                        triplet.add(nums[i]);
                        triplet.add(nums[j]);
                        triplet.add(nums[k]);
                        list.add(triplet); 
                    }
                }
            }
        }

        return list;
    }
}