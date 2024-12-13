class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> s = new HashSet<>();

        for(int i = 0; i<nums.length;i++){
            int current = nums[i];
            if(!s.contains(current))s.add(current);
            else return true;
        }
        
        return false;
    }
}