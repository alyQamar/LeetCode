class Solution {
    Map<Character,Character> mp = Map.of(
        ')','(',
        ']','[',
        '}','{'
    );
    
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char current = s.charAt(i);
            if(mp.containsKey(current)){
               if(stack.isEmpty() || stack.pop() != mp.get(current)) {
                    return false;
                }
            }else{
                stack.push(current);
            }
        }
        return stack.isEmpty();
    }
}