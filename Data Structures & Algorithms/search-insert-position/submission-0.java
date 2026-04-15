class Solution {
    public int searchInsert(int[] nums, int target) {
        //after search, if found return index
        //else, if l > r, return l, else return r
        int l = 0, r = nums.length - 1;
        int mid;

        if(target < nums[l]){
            return l;
        } 
        if (target > nums[r]){
            return r + 1;
        }

        while(l <= r){
            mid = (l + r) / 2;

            if (target > nums[mid]){
                l = mid + 1;
            } else if (target < nums[mid]){
                r = mid - 1;
            } else {
                return mid;
            }
        }
        
        return l;
    }
}