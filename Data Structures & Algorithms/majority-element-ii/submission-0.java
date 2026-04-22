class Solution {
    public List<Integer> majorityElement(int[] nums) {
        //Loop over array, count and store frequency of each element in hashmap
        //Add all element to result list which have frequency > n / 3

        Map<Integer, Integer> countMap = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        for(int num : nums){
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);

            if(countMap.get(num) > nums.length / 3 && !res.contains(num)){
                res.add(num);
            }
        }

        return res;
    }
}