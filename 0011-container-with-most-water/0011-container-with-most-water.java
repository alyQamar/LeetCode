class Solution {
    public int maxArea(int[] height) {
        int mx=0;
                
//         //Solution#1 [Time Limit Exceeded]: Brute force 
//         //time Complexity : O(N*N)
//         //Space Complexity : O(1)
        
//         for(int i=0;i<height.length;i++){
//             for(int j=i+1;j<height.length;j++){
//                 mx= max(mx,min(height[i],height[j])*(j-i));
//             }
//         }
        //Solution#2 [Accepted]: Two pointer 
        //time Complexity : O(N)
        //Space Complexity : O(1)
        
        int l=0, r= height.length-1,area =0;
        
        while(l<r){
            area = min(height[l],height[r])*(r-l);
            mx= max(mx,area);
            if(height[l]<height[r]){
                l++;
            }else{
                r--;
            }
        }
        return mx;
    }
    
    public int min(int a, int b){
        if(a>b){
            return b;
        }else{
            return a;
        }
    }
    
    public int max(int a, int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
    
}