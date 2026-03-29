class Solution {
    public int lastStoneWeight(int[] stones) {
        ArrayList<Integer> st = new ArrayList<>();
        for(int i : stones){
            st.add(i);
        }

        st.sort(Collections.reverseOrder());
        System.out.println(st);

        while(st.size() > 1){
            st.sort(Collections.reverseOrder());
            int heaviest = st.get(0);
            int secondHeaviest = st.get(1);

            if(heaviest == secondHeaviest){
                st.remove(1);
                st.remove(0);
            } else {
                st.set(0, heaviest - secondHeaviest);
                st.remove(1);
            }
        }
        if(st.isEmpty())
            return 0;
        return st.get(0);
        
    }
}
