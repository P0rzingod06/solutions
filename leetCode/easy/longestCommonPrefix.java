class Solution {
    public String longestCommonPrefix(String[] strs) {
        String longestCommonPrefix = new String();
        
        if(strs.length == 0) retun new String();
        
        for(int i = 0; i < strs[0].length(); i++) {
            if(strs[0].charAt(i) == strs[1].charAt(i)) longestCommonPrefix += strs[0].charAt(i);
            else break;
        }
        
        for(int i = 2; i < strs.length(); i++) {
            for(int j = 0; j < strs[i].length(); j++) {
                if(longestCommonPrefix.charAt(j) != strs[i].charAt(j)) {
                    longestCommonPrefix = longestCommonPrefix.substring(j);
                    break;
                }
            }
        }
        
        return longestCommonPrefix;
    }
}
