class NumArray {

    List<Integer> prefix;

    public NumArray(int[] nums) {
        prefix = new ArrayList<>();
        int total = 0;

        //Single pass: build the prefix sum
        for(int n : nums){
            total += n;
            prefix.add(total);
        }
    }
    
    public int sumRange(int left, int right) {
        int preRight = prefix.get(right);
        int preLeft = left > 0 ? prefix.get(left - 1) : 0;
        return (preRight - preLeft);
    }
}