/**
 * @param {number[]} nums
 * @return {number[]}
 */
var sortedSquares = function(nums) {
    for(let i =0;i<nums.length;i++){
        // Square number 
        nums[i] *= nums[i];
    }// O(N)
    
    nums.sort((a, b)=>{return a - b});
    
    return nums;
};