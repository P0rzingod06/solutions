class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] repeatedChars = new int[26];
        int lowerBound = 0;
        String longestSubString = new String();
        String currentSubString = new String();

        s = s.toLowerCase();
        for(int i = 0;i < s.length();i++) {
            System.out.println(repeatedChars[s.charAt(i) - 'a']);
            if(repeatedChars[s.charAt(i) - 'a'] > 0) {
                lowerBound = repeatedChars[s.charAt(i) - 'a'] + 1;
                repeatedChars = new int[26];
                currentSubString = "";
            } else {
                System.out.println(currentSubString);
                repeatedChars[s.charAt(i) - 'a'] = i; //array gets init to 0 so index 0 won't work
                currentSubString += s.charAt(i);
                if(currentSubString.length() > longestSubString.length()) longestSubString = currentSubString;
            }
        }
        
        System.out.println(longestSubString);
        return longestSubString.length();
    }
}:
