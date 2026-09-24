class Solution {
    public int numIslands(char[][] grid) {
        //count tracks number of islands found
        //scan every cell in grid:
        //  if this cell is land('1'):
        //      it's a new island - increment count
        //      run DFS from here, flipping every conencted land cell to '0'
        //return count
        int count = 0;

        //Scan every cell in grid exactly once:
        for(int row = 0; row < grid.length; row++){
            for(int col = 0; col < grid[0]. length; col++){
                //Found an unvisited piece of land - brand new island
                if(grid[row][col] == '1'){
                    count++;
                    //explore and mark the entire island to not visit again
                    dfs(grid, row, col);
                }
            }
        }

        return count;
    }

    private void dfs(char[][] grid, int row, int col){
        //Base case: stop if we went out of bounds, or landed in water/already-visited land
        if(row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || grid[row][col] == '0'){
            return;
        }

        //mark cell as visited by turning into water('0'), this prevents from revisiting or recouninting it
        grid[row][col] = '0';

        //Explore all four directions from here - up, down, right, left
        dfs(grid, row + 1, col);
        dfs(grid, row - 1, col);
        dfs(grid, row, col + 1);
        dfs(grid, row, col - 1);
    }
}