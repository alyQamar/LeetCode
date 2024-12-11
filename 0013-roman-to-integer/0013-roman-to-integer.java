class Solution {
    Map<Character, Integer> romanSymbols = Map.of(
        'I', 1,
        'V', 5,
        'X', 10,
        'L', 50,
        'C', 100,
        'D', 500,
        'M', 1000
    );
    
    private int checkSubtractCase(Character ch1, Character ch2) {
        if (ch1 == 'I' && ch2 == 'V') return 4;
        else if (ch1 == 'I' && ch2 == 'X') return 9;
        else if (ch1 == 'X' && ch2 == 'L') return 40;
        else if (ch1 == 'X' && ch2 == 'C') return 90;
        else if (ch1 == 'C' && ch2 == 'D') return 400;
        else if (ch1 == 'C' && ch2 == 'M') return 900;
        
        return 0;
    }
    
    public int romanToInt(String s) {
        int resultNum = 0;
        for (int i = 0; i < s.length(); i++) {
            Character ch1 = s.charAt(i);
            if (i + 1 < s.length()) {
                Character ch2 = s.charAt(i + 1);
                Integer caseVal = checkSubtractCase(ch1, ch2);

                if (caseVal != 0) {
                    resultNum += caseVal;
                    i++;
                } else {
                    resultNum += romanSymbols.get(ch1);
                }
            } else {
                resultNum += romanSymbols.get(ch1);
            }
        }
        return resultNum;
    }
}
