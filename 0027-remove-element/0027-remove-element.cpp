class Solution {
public:
    int removeElement(vector<int>& nums, int val) {
        vector<int> temp;
        
        for(auto i:nums){
             if(i!=val){
                 temp.push_back(i);
             }
        }
        
        nums=temp;
        
        return nums.size() ;
    }
};