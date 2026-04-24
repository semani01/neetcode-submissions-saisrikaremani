class Solution {
    public int search(int[] nums, int target) {
        //declare pointers to keep track of search space
        int L = 0, R = nums.length - 1;
        int mid;

        //divide search space by half by comparing the middle value to target
        while(L <= R){
            mid = (L + R) / 2;

            if(target > nums[mid]){
                L = mid + 1;
            } else if (target < nums[mid]){
                R = mid - 1;
            } else {  //found
                return mid;
            }
        }

        //not found
        return -1;
    }
}
