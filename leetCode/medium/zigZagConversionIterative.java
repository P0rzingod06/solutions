class Solution {
    public String convert(String s, int numRows) {
        int startingStep = numRows + (numRows - 2);
        String result = new String();
        
        if(numRows == 1) return s;
        
        int currentStep = startingStep;
        for(int i = 0; i < numRows; i++) {
            int currentIndex = i;
            while(currentIndex < s.length()) {
                result += s.charAt(currentIndex);
                currentIndex += currentStep;                
            }
            if(currentStep != 2) currentStep -= 2;
            else currentStep = startingStep;
        }
        
        return result;//PAHNAPLSIIGYIR
    }
}
