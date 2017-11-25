class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> repeatedChars = new HashMap<Character,Integer>();
        int lowerBound = 0;
        String longestSubString = new String();
        String currentSubString = new String();
        
        for(int i = 0;i < s.length();i++) {
            if(repeatedChars.containsKey(s.charAt(i))) {
                lowerBound = repeatedChars.get(s.charAt(i)) + 1;
                repeatedChars.clear();
                currentSubString = "";
            } else {
                repeatedChars.put(s.charAt(i),i);
                currentSubString += s.charAt(i);
                if(currentSubString.length() > longestSubString.length()) longestSubString = currentSubString;
            }
        }
        
        return longestSubString.length();
    }
}
