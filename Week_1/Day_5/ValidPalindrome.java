class Solution {
    public boolean isPalindrome(String s) {
        String st = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int i=0;
        int j= st.length()-1;
        for (int k=0; k<st.length(); k++)
        {
            if(st.charAt(i)==st.charAt(j))
            {
                i++;
                j--;
            }
            else{
                return false;
            }
        }
      return true;  
    }
}