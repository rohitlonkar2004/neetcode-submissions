class Solution {
    public int[] replaceElements(int[] arr) {
        
        Stack<Integer> st = new Stack<>();
          st.push(-1);

          ArrayList list = new ArrayList<>();
        for( int i=arr.length-1; i>=0; i-- ) {
            if(  arr[i] > st.peek()  ) {
                list.add(st.peek());
                st.push(arr[i]);
            }
            else {
                list.add(st.peek());
            }
        }
        
        Collections.reverse(list);
      
       int []ans = new int[arr.length];
         for( int i=0; i<arr.length; i++ ) {
            ans[i] = (int) list.get(i);
         }

         return ans;
    }
}