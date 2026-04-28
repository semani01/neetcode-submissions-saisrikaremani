class Solution {
    public int largestUniqueNumber(int[] nums) {
        Arrays.sort(nums);
        // System.out.println(Arrays.toString(nums));

        Map<Integer, Integer> countMap = new HashMap<>();
        for(int num : nums){
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // System.out.println(countMap);
        //Defining global largest unique number
        int largestKey = -1;

        for(Integer key : countMap.keySet()){
            Integer value = countMap.get(key);

            if(value == 1 && key >= largestKey){
                largestKey = key;
            }
        }

        return largestKey;
    }
}
