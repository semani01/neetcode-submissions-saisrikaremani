class Solution {
    public boolean hasDuplicate(int[] nums) {
        // HashMap<Integer, Integer> hm = new HashMap<>();

        // for(int i = 0; i < nums.length; i++){
        //     if(hm.containsKey(nums[i])){
        //         return true;
        //     }
        //     hm.put(nums[i], 1);
        // }

        // //System.out.println(hm);

        // return false;

        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }

        return false;
    }
}
