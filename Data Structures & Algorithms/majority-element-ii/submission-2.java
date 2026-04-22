class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        List<Integer> res = new ArrayList<>();
        for (int key : count.keySet()) {
            //System.out.println("Key: " + key + ", count: " + count.get(key));
            if (count.get(key) > nums.length / 3) {
                res.add(key);
            }
        }

        return res;
    }
}