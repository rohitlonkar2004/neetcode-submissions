class Solution {
    public int countSeniors(String[] details) {
        
        String ans1 = "";
        int ct =0;
        for( int i=0; i<details.length; i++ ) {
          String ans = "";
           ans1 = "";
                ans += details[i];
                ans1 = ans.substring(11,13);
                int age = Integer.valueOf(ans1);
                if( age > 60 ) {
                    ct++;
                }

        }
     //   String ans =  details.subString(11,12);

     
        //System.out.println(ans1);

    

        return ct;
    }
}