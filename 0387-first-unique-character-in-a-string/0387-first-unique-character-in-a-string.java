class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> mp = new HashMap<>();
        for(int i =0;i<s.length();i++){
            char current = s.charAt(i);
            mp.put(current,mp.getOrDefault(current,0)+1);
        }
        for(int i =0;i<s.length();i++){
            char current = s.charAt(i);
            if(mp.get(current)==1) return i;
        }
        return -1;
    }
}