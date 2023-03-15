class Solution {
    public boolean isMonotonic(int[] nums) {
           boolean dec = false;
           boolean inc = false;
           
           for(int i=1;i<nums.length;i++){
               if(nums[i-1]<nums[i]){
                   inc = true;
               }else if(nums[i-1]==nums[i]){
                   continue;
               }else{
                   dec = true;
               }
               if (inc&&dec==true){
                   return false;
               }
           }
        return true;
    }
}