class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        //maxArea tracks the largest island area so far
        int maxArea = 0;

        //Scan every cell in the grid:
        //  if this cell is land(1):
        //      run dfs from here, which returns size of island
        //      update maxArea if this island is bigger
        for(int row = 0; row < grid.length; row++){
            for(int col = 0; col < grid[0].length; col++){
                //found an unvisited piece of land - measure its full island size
                if(grid[row][col] == 1){
                    int area = dfs(grid, row, col);
                    maxArea = Math.max(maxArea, area);
                }
            }
        }
        //return maxArea
        return maxArea;
    }

    private int dfs(int[][] grid, int row, int col){
        //Check for bounds or if this cell is water, return 0
        if(row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || grid[row][col] == 0){
            return 0;
        }

        //Mark the visited cell, flip it to 0
        grid[row][col] = 0;

        //return 1(for this cell) plus the area from all 4 neighboring directions
        return 1
            + dfs(grid, row + 1, col)
            + dfs(grid, row - 1, col)
            + dfs(grid, row, col + 1)
            + dfs(grid, row, col - 1);
    }
}