class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        int[] ans = new int[nums1.length];
        int  k = 0;
        boolean is = false;
        for( int i=0; i<nums1.length; i++ ) {
             for( int j=0; j<nums2.length; j++ ) {
                if( nums1[i] == nums2[j] ) {
                    is = false;
                    while( j < nums2.length-1 ) {
                        if( nums1[i] < nums2[j+1] ) {
                            is = true;
                            ans[k++] = nums2[j+1];
                        }
                        if( is == true ) {
                            break;
                        }
                        j++;
                    }

                    if( is == false  ) {
                        ans[k++] = -1;
                    }
                }
             }
        }

        return ans;
    }
}