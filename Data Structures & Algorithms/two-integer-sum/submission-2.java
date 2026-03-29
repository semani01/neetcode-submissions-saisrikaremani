class Solution {
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> indices = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    indices.add(i);
                    indices.add(j);
                    break;
                }
            }
        }

        //System.out.println("Arraylist: " + indices);
        int []ind = new int[indices.size()];
        for(int i = 0; i < indices.size(); i++){
            ind[i] = indices.get(i);
        }

        return ind;
    }
}
