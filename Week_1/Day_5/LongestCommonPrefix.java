class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s= strs[0];
        char c;
        for(int i=0; i<s.length(); i++)
        {
        c= s.charAt(i);
            for(int j=1; j<strs.length; j++)
            {
                if( i>=strs[j].length() || strs[j].charAt(i)!=c){
                return s.substring(0,i);
            }
        }
        }
        return s;
    }
}