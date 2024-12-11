class Solution {
    public int[] sortedSquares(int[] nums) {
/*
*Approach #1: Brute Force
*Time Complexity: O(nlog(n))
*Space Complexity: O(1)
*/
        // for(int i =0; i < nums.length; i++){
        //     nums[i] = nums[i] * nums[i];
        // }
        // Arrays.sort(nums);
        // return nums;

/*
*Approach #2: Two Pointer
*Time Complexity: O(n)
*Space Complexity: O(n)
*/
        int s = nums.length;
        int [] res = new int[s];
        
        int l = 0;
        int r = s -1;
        int i = r;
        
        while(l<=r){
            int sqNum;
            if(Math.abs(nums[l])<Math.abs(nums[r])){
                sqNum = nums[r];
                r--;
            }else{
                sqNum = nums[l];
                l++;
            }
            res[i] = sqNum * sqNum;
            i--;
        }
        return res;
    }
}