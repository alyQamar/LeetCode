class Solution {
public:
   int mostWordsFound(vector<string> &sentences) {
    int mx = 0;
    for (auto i: sentences) {
        int x = count(i.begin(), i.end(), ' ') + 1;
        mx = max(mx, x);
    }
    return mx;
}
};