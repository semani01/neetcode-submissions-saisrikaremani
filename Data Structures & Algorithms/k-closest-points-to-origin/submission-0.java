class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparing(a -> a[0]));
        for (int[] point : points) {
            int dist = point[0] * point[0] + point[1] * point[1]; // Calculate squared distance
            minHeap.offer(new int[]{dist, point[0], point[1]});   // Store {distance, x, y}
        }

        int[][] result = new int[k][2];
        for (int i = 0; i < k; ++i) {
            int[] point = minHeap.poll(); // Extract the closest point
            result[i] = new int[]{point[1], point[2]}; // Store {x, y}
        }
        return result;
    }
}
