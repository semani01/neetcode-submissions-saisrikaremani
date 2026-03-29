class NumMatrix {

    List<List<Integer>> prefix; 

    public NumMatrix(int[][] matrix) {
        prefix = new ArrayList<>();
        for(int []row : matrix){
            //Creating an ArrayList for each row in matrix
            List<Integer> prefixRow = new ArrayList<>();
            int total = 0;
            for(int val : row){
                total += val;
                prefixRow.add(total);
            }
            prefix.add(prefixRow);
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int rangeSum = 0;
        //Iterate from row1 to row2
        for(int R = row1; R <= row2; R++){
            int preRight = prefix.get(R).get(col2);
            int preLeft = col1 > 0 ? prefix.get(R).get(col1 - 1) : 0;
            rangeSum += preRight - preLeft;
        }
        return rangeSum;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */