class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        //Rememeber the starting pixel's original color
        int originalColor = image[sr][sc];

        //If original color equals the target color, return as-is
        if(originalColor == color){
            return image;
        }

        //Otherwise, run DFS from (sr, sc), repainiting matching pixels and spreading outward
        dfs(image, sr, sc, originalColor, color);

        //Return the modified image
        return image;
    }

    private void dfs(int[][] image, int row, int col, int originalColor, int newColor){
        //Check for bounds or this pixek doesn't match originalColor, stop
        if (row < 0 || row >= image.length || col < 0 || col >= image[0].length || image[row][col] != originalColor){
            return;
        }

        //Repaint this pixel to new color
        image[row][col] = newColor;

        //Recursively explore all 4 neighbors
        dfs(image, row + 1, col, originalColor, newColor); //down
        dfs(image, row - 1, col, originalColor, newColor); //up 
        dfs(image, row, col + 1, originalColor, newColor); //right
        dfs(image, row, col - 1, originalColor, newColor); //left
    }
}