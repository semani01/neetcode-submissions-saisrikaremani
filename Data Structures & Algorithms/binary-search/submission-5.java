class Solution {
    public int search(int[] nums, int target) {
        //Declare pointers to keep track of search space
        int L = 0, R = nums.length - 1;
        int mid;

        //Dividing search space by half with each iteration
        while(L <= R){
            mid = L + (R - L) / 2;

            if(target > nums[mid]){
                L = mid + 1;
            } else if(target < nums[mid]){
                R = mid - 1;
            } else {
                return mid;
            }
        }

        //target not existing in array
        return -1;
    }
}
