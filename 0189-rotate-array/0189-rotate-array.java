class Solution {
    public void rotate(int[] nums, int k) {
        //ASK About [See Constraints]
        //1- Empty array
        //2- if K may equal 0 ??
        
        k= k % nums.length;
        int len =nums.length;

//         //Solution#1: Brute force 
//         //time Complexity : O(N)
//         //Space Complexity : O(k)

//         int[] a = new int[k];              
//         //handle first part 
//         int cnt =0;
//         for(int i=len-k;i<len;i++){
//             a[cnt]= nums[i];
//             cnt++;
//         }
        
//         //shift array to leave space for the first part
//         // must loop from last to first
//         for(int i=len-k-1;i>=0;i--){
//             nums[i+k]=nums[i];
//         }
        
//         //put first part
//         for(int i=0;i<k;i++){
//             nums[i]=a[i];
//         }
        
        //Solution#2: two pointer (optimal) 
        //time Complexity : O(N)
        //Space Complexity : O(1)
        
        //Reverse all array
        reverse(nums,0,len-1);
        //reverse first part 
        reverse(nums,0,k-1);
        //reverse second part (index k --> len-1)
        reverse(nums,k,len-1);
        
        
    }
    
    public void reverse(int[]nums,int start,int end){
        while(start<end){
            int temp = nums[start];
            nums [start]=nums[end];
            nums [end]= temp;
            start++;
            end--;
        }
    }
}