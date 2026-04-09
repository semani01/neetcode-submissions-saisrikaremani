class Solution {
    public int singleNumber(int[] nums) {
        //A hashmap with number and its frequency
        HashMap<Integer, Integer> countMap = new HashMap<>();

        //Iterate over the array and count(or update) frequency of each integer
        for(int i = 0; i < nums.length; i++){
            countMap.put(nums[i], countMap.getOrDefault(nums[i], 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : countMap.entrySet()){
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            if(value == 1){
                return key;
            }
        }


        return -1;
    }
}
