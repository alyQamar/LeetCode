class Solution {
/*
    * Approach #1  Brute Force Nested Loop
    * Time Complexity: O(n2)
    * pace Complexity: O(1)
*/     
    // public int[] twoSum(int[] nums, int target) {
    //     for(int i = 0; i<nums.length-1; i++){
    //         for(int j=i+1;j<nums.length;j++){
    //             if(nums[i]+nums[j] == target){
    //                 return new int [] {i,j};
    //             }
    //         }
    //     }
    //     return new int []{};
    // }
/*
    * Approach #2 Recursion ---> Runtime error but still valid out of this problem constraints
    * Time Complexity: O(n2)
    * pace Complexity: O(1)
*/   
//     public int[] twoSum(int[] nums, int target) {
        
//         return checkSum(0,1,nums,target);
//     }
    
//     private int[] checkSum(int i, int j,int[] nums, int target){
//         //Inner break condition
//         if(j==nums.length){
//             return checkSum(i+1,i+2,nums,target);
//         }
//         //Outer break condition
//         if(i==nums.length-1){
//             return new int []{};
//         }
//         // Valid return
//         if(nums[i]+nums[j]==target){
//             return new int []{i,j};
//         }
//         return checkSum(i,j+1,nums,target);
//     }
    
/*
    * Approach #3 Hash Map (Optimal Solution)
    * Time Complexity: O(n)
    * Space Complexity: O(n)
*/ 
    
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> numsMp= new HashMap<>();
        for(int i =0; i<nums.length;i++){
            int firstNum =target - nums[i];
            if(numsMp.containsKey(firstNum)){
                return new int []{numsMp.get(firstNum),i};
                
            }else{
                numsMp.put(nums[i],i);
            }
        }
        return new int []{};

    }

}
