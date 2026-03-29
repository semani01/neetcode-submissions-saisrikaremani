class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //Step 1: Count frequencies using a HashMap
        Map<Integer, Integer> countMap = new HashMap<>();
        for(int num : nums){
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        System.out.println(countMap);

        //Step 2: Create buckets(array of lists) where index = frequency
        List<Integer>[] buckets = new List[nums.length + 1]; //handling the case where same element appears nums.length times
        for(int key : countMap.keySet()){
            int frequency = countMap.get(key);
            if(buckets[frequency] == null){
                buckets[frequency] = new ArrayList<>();
            }
            buckets[frequency].add(key);
        }

        System.out.println(Arrays.toString(buckets));

        //Step 3: Iterate from highest frequency bucket to collect top K        
        int []result = new int[k];
        int index = 0;

        for(int i = buckets.length - 1; i >= 0 && index < k; i--){
            if(buckets[i] != null){
                for(int val : buckets[i]){
                    result[index++] = val;
                    if(index == k) return result;
                }
            }
        }

        return result;
    }
}
