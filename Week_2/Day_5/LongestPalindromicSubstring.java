class Solution {

    public String longestPalindrome(String s) {

        String ans = "";

        for(int k = 0; k < s.length(); k++) {

            // odd length palindrome
            int i = k;
            int j = k;

            while(i >= 0 && j < s.length()) {

                if(s.charAt(i) == s.charAt(j)) {
                    i--;
                    j++;
                }
                else {
                    break;
                }
            }

            String t = s.substring(i + 1, j);

            if(t.length() > ans.length()) {
                ans = t;
            }


            // even length palindrome
            i = k;
            j = k + 1;

            while(i >= 0 && j < s.length()) {

                if(s.charAt(i) == s.charAt(j)) {
                    i--;
                    j++;
                }
                else {
                    break;
                }
            }

            t = s.substring(i + 1, j);

            if(t.length() > ans.length()) {
                ans = t;
            }
        }

        return ans;
    }
}