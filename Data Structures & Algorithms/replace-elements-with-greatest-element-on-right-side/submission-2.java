class Solution {
    public int[] replaceElements(int[] arr) {
        
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(-1);
        for( int i=arr.length-1; i>0; i-- ) {
            if( arr[i] >= st.peek() ) {
                st.push(arr[i]);
            }
            list.add(st.peek());
        }

        Collections.reverse(list);
        for( int i=0; i<list.size(); i++ ) {
            arr[i] = list.get(i);
        }

        return arr;

    }
}