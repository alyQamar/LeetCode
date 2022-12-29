/**
 * @param {number[]} nums
 * @return {number}
 */
var largestPerimeter = function (nums) {
    nums.sort(function(a, b){return a - b});
    console.log(nums)
    let max =0;
    for (let i = 0; i < nums.length - 2; i++) {
        if (nums[i] + nums[i + 1] > nums[i + 2]) {
            max= nums[i] + nums[i + 1] + nums[i + 2];
        }
    }
    return max;
};