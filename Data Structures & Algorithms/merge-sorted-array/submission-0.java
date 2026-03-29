class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //General merge function
        //Step 1: calculate lengths of the two subarrays
        //Step 2: create temp arrays and copy sorted left and right halves to temp arrays
        //Step 3: Initialize indices i, j, and k
        //Step 4: Compare values in the temp arrays and add to arr
        //Step 5: Add remaining values from either left or right array
        //Step 6: Return arr

        //Specialized merge function here
        //Step 1: already have lengths: m+n, and n
        //Step 2: create temp arrays and copy sorted left and right halves to temp arrays
        int []L = new int[m];
        int []R = new int[n];

        for(int i = 0; i < m; i++){
            L[i] = nums1[i];
        }

        for(int j = 0; j < n; j++){
            R[j] = nums2[j];
        }

        //Step 3: Initialize indices i, j, and k in arrays L, R, and nums1 respectively
        int i = 0, j = 0, k = 0;

        //Step 4: Compare values in the temp arrays and update nums1
        while(i < m && j < n){
            if(L[i] <= R[j]){
                nums1[k] = L[i];
                i++;
            } else {
                nums1[k] = R[j];
                j++;
            } 
            k++;
        }
        //Step 5: Add remaining values from left or right array
        while(i < m){
            nums1[k] = L[i];
            i++;
            k++;
        }

        while(j < n){
            nums1[k] = R[j];
            j++;
            k++;
        }
        //Step 6: Print nums1 to verify before submission
        System.out.println(Arrays.toString(nums1));
    }
}