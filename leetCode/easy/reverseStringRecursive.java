class Solution {
    public String reverseString(String s) {
        return reverseStringHelper(s,new String());
    }
    
    public String reverseStringHelper(String s, String result) {
        int startingIndex = 0;
        if(s.length() == 1) result += s;
        else {
            result = reverseStringHelper(s.substring(++startingIndex,s.length()),result);
            result += s.substring(0,1);
        }
        return result;
    }
}
