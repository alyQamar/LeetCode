class Solution {
    public boolean isMonotonic(int[] nums) {
               //
        boolean dec= false;
        boolean inc =false;
        //itr#1: i=1
        //itr#1: i=2
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]<nums[i]){
                inc =true;
            }else if(nums[i-1] > nums[i]){
                dec=true;
            }
            
            if(inc&&dec){
                return false;
            }
        }
        return true;
    }
}