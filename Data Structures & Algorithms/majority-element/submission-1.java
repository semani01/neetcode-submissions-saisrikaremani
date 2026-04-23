class Solution {
    public int majorityElement(int[] nums) {
        //Loop over array, count and store frequency of each element in hashmap
        //Return element with highest frequency
        Map<Integer, Integer> countMap = new HashMap<>();
        int majElement = nums[0];
        for(int num : nums){
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);

            if(countMap.get(num) > nums.length / 2){
                majElement = num;
            }
        }

        return majElement;
    }
}