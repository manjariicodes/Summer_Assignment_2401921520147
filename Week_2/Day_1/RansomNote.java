class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character, Integer> map = new HashMap<>();

        for(char a : magazine.toCharArray()) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }

        for(char ch : ransomNote.toCharArray()) {
            if(!map.containsKey(ch) || map.get(ch) == 0) {
                return false;
            }

            map.put(ch, map.get(ch) - 1);
        }

        return true;
    }
}