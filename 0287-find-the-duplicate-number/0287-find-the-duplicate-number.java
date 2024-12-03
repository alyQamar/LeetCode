import java.util.Arrays;
class Solution {
// Approach #1: brute force
// Time Complexity: O(n log n)
// Space Complexity: : O(n) - Sorting requires additional space
    // public int findDuplicate(int[] nums) {
    //     Arrays.sort(nums);
    //     for(int i =0;i<nums.length-1;i++){
    //         if(nums[i]==nums[i+1]){
    //             return nums[i];
    //         }
    //     }
    //     return 0;
    // }
// Approach #2: BitSet
// Time Complexity: O(n)
// Space Complexity: :O(1)
    private final int MAX_NUM = 100000;
    public int findDuplicate(int[] nums) {
        BitSet bits = new BitSet(MAX_NUM);
        for(int i = 0; i<nums.length;i++){
            if(bits.get( nums[i])){
                return nums[i];
            }else{
                bits.set( nums[i]);
            }
        }
        return 0;
    }

}