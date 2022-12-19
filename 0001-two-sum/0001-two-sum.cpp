class Solution {
public:
vector<int> twoSum(vector<int> &nums, int target) {
    vector<int> res(2);
    int cnt = 0;
    for (auto i: nums) {
        cnt++;
    }
    for (int i = 0; i < cnt; ++i) {
        for (int j = i + 1; j < cnt; ++j) {
            if (nums[i] + nums[j] == target) {
                res[0] = i;
                res[1] = j;
                return res;
            }
        }
    }
    return res;
}

};