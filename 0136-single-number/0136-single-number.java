class Solution {
    /*
    * Approach 1: Sorting + check i, i+1
    * Time Complexity: O(nlog(n))
    * Space Complexity: O(1)
    */
//     public int singleNumber(int[] nums) {

//         Arrays.sort(nums);
//         if (nums.length == 1) {
//             return nums[0];
//         }
//         for(int i = 0; i<nums.length-1;i++){
//             if(nums[i]!=nums[i+1]){
//                return nums[i];
//             }else{
//                 i++;
//                 if(i == (nums.length-2)){
//                     return nums[i+1];
//                 }
//             }
         
//         }
//         return 0;
        
//     }
    /*
    * Approach 1: Sorting + check i, i+1
    * Time Complexity: O(n)
    * Space Complexity: O(1)
    */
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int i =0; i<nums.length;i++){
            result ^= nums[i];
        }
        return result;
        
    }
}