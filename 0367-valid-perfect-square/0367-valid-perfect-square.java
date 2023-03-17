class Solution {
    public boolean isPerfectSquare(int num) {
        int low = 1;
        int high = num/2;
        
        if(num==1)  return true;
             //3*3 =9
             //num==9
             //low=0
             //high=4
             //m= 2  // target = 4
             //********************* */
             //high=2
             //low=3
             //mid=3
             //mid*mid==9
        while(low<=high){
             int  mid = (low+high)/2;
             if(mid == (num/mid) && num % mid == 0){return true;} 
             else if(mid <(num/mid)) low=mid+1;
             else high=mid-1;     
         }
         return false;
    }
}