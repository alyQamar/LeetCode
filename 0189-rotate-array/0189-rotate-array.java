class Solution {
    public void rotate(int[] nums, int k) {
        //Solution#1: Brute force
        int[] a = new int[k];
        k= k % nums.length;
        int len =nums.length;
        boolean bol = (k==0||nums.length==1);
        
        if(!bol){
        //handle first part 
        int cnt =0;
        for(int i=len-k;i<len;i++){
            a[cnt]= nums[i];
            cnt++;
        }
        //shift array to leave space for the first part
        // must loop from last to first
        for(int i=len-k-1;i>=0;i--){
            nums[i+k]=nums[i];
        }
        //put first part
        for(int i=0;i<k;i++){
            nums[i]=a[i];
        }    
        }
    }
}