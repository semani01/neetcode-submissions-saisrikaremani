class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int L = 0;
        int res = 0;
        int sum = 0;

        for (int R = 0; R < arr.length; R++) {
            sum += arr[R];
            
            if (R - L + 1 > k) {
                sum -= arr[L];
                L++;
            }

            if (R - L + 1 == k) {
                //logic for calc average and incrementing result
                if((sum / k) >= threshold){
                    res++;
                }   
            }
        }
        return res;
    }
}