class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //Efficient solution
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while(j >= 0){ //elements left in nums2
            //Check if nums1 has elements left and if current element is larger
            if(i >= 0 && nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                i--;
            } else{
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
    }
}