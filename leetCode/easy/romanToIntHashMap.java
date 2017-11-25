class Solution {
    public int romanToInt(String s) {
        //also use an integer array of size 26 to get used to that
        HashMap<Character,Integer> romanValues = new HashMap<Character,Integer>(){{
            put('I',1);
            put('V',5);
            put('X',10);
            put('L',50);
            put('C',100);
            put('D',500);
            put('M',1000);
        }};
        int result = 0;
        int index = 0;
        
        while(index < s.length()) {
            char currentChar = romanValues.get(s.charAt[index]);
            char nextChar = romanValues.get(s.charAt[index + 1]);
            if(romanValues.get(currentChar) >= romanValues.get(nextChar)) result += currentChar;
            else {
                result += romanValues.get(nextChar) - romanValues.get(currentChar);
                index++;
            }
            index++;
        }
        
        return result;
    }
}
