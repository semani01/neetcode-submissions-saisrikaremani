class Solution {
    public int numIslands(char[][] grid) {
        //track number of islands
        int count = 0;

        //Scan every cell in the grid exactly once
        for(int row = 0; row < grid.length; row++){
            for(int col = 0; col < grid[0].length; col++){
                //Found an univsited piece of land - a brand new island
                if(grid[row][col] == '1'){
                    count++;
                    //explore and sink the island so we never recount it
                    bfs(grid, row, col);
                }
            }
        }

        return count;
    }

    private void bfs(char[][] grid, int row, int col){
        int rows = grid.length;
        int cols = grid[0].length;

        //Queue holds cells we still need to expand outward from
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{row, col});

        //Mark starting cell visited immediately as soon as it's queued
        grid[row][col] = '0';

        //Direction offsets for the 4 neighbors
        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        while(!queue.isEmpty()){
            int[] current = queue.poll();

            //Check all 4 neighbors of current cell
            for(int[] dir : directions){
                int newRow = current[0] + dir[0];
                int newCol = current[1] + dir[1];

                //We continue only if neighbor is in bounds and is unvisited
                if(newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols && grid[newRow][newCol] == '1') {
                    //Mark visited and add to queue
                    grid[newRow][newCol] = '0';
                    queue.offer(new int[]{newRow, newCol});
                }
            }
        }
    }
}