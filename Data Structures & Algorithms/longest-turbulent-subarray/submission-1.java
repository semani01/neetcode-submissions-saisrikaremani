class Solution {
    public int maxTurbulenceSize(int[] arr) {
        if (arr.length == 1) return 1;
        int l = 0;
        int res = 1;
        String prev = "";

        for(int r = 1; r < arr.length; r++){
            if(arr[r - 1] > arr[r] && !prev.equals(">")){
                res = Math.max(res, r - l + 1);
                prev = ">";
            }    
            else if(arr[r - 1] < arr[r] && !prev.equals("<")){
                res = Math.max(res, r - l + 1);
                prev = "<";
            }
            else{
                l = (arr[r - 1] == arr[r]) ? r : r - 1;
                r = l;
                prev = "";
            }
        }

        return res;
    }
}