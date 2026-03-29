class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //Count frequency of each number in nums and store as key-value pairs in a HashMap
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        //Iterating k times, we find the key(number) with the largest value(frequency)
        //Add it to result array and delete from map
        //Keep doing it for k times
        List<Integer> res = new ArrayList<>();
        while(k > 0){
            int maxValue = 0;
            //declare the pointer to the key with max value in this iteration
            Integer key = 0;
            for(Map.Entry<Integer, Integer> entry : map.entrySet()){
                Integer value = entry.getValue();
                if(value > maxValue){
                    maxValue = value;
                    key = entry.getKey();
                }              
            }
            res.add(key);
            map.remove(key);
            k--;
            //next iteration, prev max removed from map
        }        

        //Create output array from ArrayList
        int []resArray = new int[res.size()];
        for(int i = 0; i < res.size(); i++){
            resArray[i] = res.get(i);
        }

        return resArray;
    }
}
