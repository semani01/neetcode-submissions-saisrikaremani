class Solution {

    //Declare a prefix sum array(list)
    List<Integer> prefix;

    public int pivotIndex(int[] nums) {
        prefix = new ArrayList<>();
        int total = 0;

        //Step 1: Build the prefix sum array
        for(int n : nums){
            total += n;
            prefix.add(total);
        }

        int totalPrefixSum = prefix.get(prefix.size() - 1);
        //Step 2: Single pass through prefix sum array, check if index is pivot index
        for(int i = 0; i < prefix.size(); i++){
            int rightSum = 0;
            int leftSum = 0;

            //handling edge case 1: if pivot index is the first element
            if(i == 0){
                leftSum = 0;
                rightSum = totalPrefixSum - prefix.get(i);
                if(leftSum == rightSum){
                    return 0;
                }
            } else if(i == prefix.size() - 1){  //handling edge case 2: if pivot index is the last element
                rightSum = 0;
                leftSum = prefix.get(i - 1);
                if(leftSum == rightSum){
                    return (prefix.size() - 1);
                }
            } else { //For every other case
                leftSum = prefix.get(i - 1);
                rightSum = totalPrefixSum - prefix.get(i);
                if(leftSum == rightSum){
                    return i;
                }
            }
        }

        return -1;
    }
}
