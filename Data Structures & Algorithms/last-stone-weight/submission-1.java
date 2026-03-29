class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for(int i : stones){
            maxHeap.add(i);
        }

        while(maxHeap.size() > 1) {
            int heaviest = maxHeap.poll();
            int secondHeaviest = maxHeap.poll();
            if (secondHeaviest < heaviest) {
                maxHeap.add(heaviest - secondHeaviest);
            }
        }

        if(maxHeap.isEmpty())
            return 0;
        return maxHeap.peek();
    }
}
