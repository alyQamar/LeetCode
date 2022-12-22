class Solution {
public:
vector<int> twoSum(vector<int> &nums, int target) {
    vector<int> res(2);
    int cnt = 0;
    for (auto i: nums) {
        cnt++;
    }
    for (int i = 0; i < cnt; ++i) {
        int x = target - nums[i];
        bool bol = binary_search(nums.begin(), nums.end(), x);
        if (bol) {
            int j = lower_bound(nums.begin(), nums.end(), x) - nums.begin();
            if (i==j){
                res[0] = i+1;
                res[1] = i+2;
            }else{
                res[0] = i+1;
                res[1] = j+1;
            }
            return res;
        }
    }
    return res;
}
};