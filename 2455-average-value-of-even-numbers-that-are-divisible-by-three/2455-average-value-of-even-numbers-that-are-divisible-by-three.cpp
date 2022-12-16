class Solution {
public:
int averageValue(vector<int> &nums) {
    int cnt = 0, sum;
    vector<int> v;
    for (int i = 0; i < nums.size(); ++i) {
        if (nums[i] % 2 == 0 && nums[i] % 3 == 0) {
            v.push_back(nums[i]);
            cnt++;
        }
    }

    sum = accumulate(v.begin(), v.end(), 0);
    if (cnt > 0) {
        return sum / cnt;
    } else {
        return 0;
    }
}
};