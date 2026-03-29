class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //get number of rows and cols
        int ROWS = matrix.length, COLS = matrix[0].length;

        //declare pointers to keep track of search space
        int L = 0, R = (ROWS * COLS) - 1;
        int mid;

        //divide search space by half while comparing middle value to target
        //also update the middle value by computing row and col of mid
        while(L <= R){
            mid = (L + R) / 2;
            int row = mid / COLS;
            int col = mid % COLS;

            if (target > matrix[row][col]){
                L = mid + 1;
            } else if (target < matrix[row][col]){
                R = mid - 1;
            } else { //found
                return true;
            }
        }

        //not found
        return false;

    }
}
