class Solution {
    public boolean isPalindrome(String s) {
        s = s.trim().toLowerCase();
        int l = 0;
        int r = s.length()-1;
        if(s.length() == 1 || s.isEmpty()) return true;
        while(l<r){
            char ch1 = s.charAt(l);
            char ch2 = s.charAt(r);
            
            if(!Character.isLetterOrDigit(ch1)){
                l++;
                continue;
            }else if(!Character.isLetterOrDigit(ch2)){
                r--;
                continue;
            }else if(ch1 != ch2){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}