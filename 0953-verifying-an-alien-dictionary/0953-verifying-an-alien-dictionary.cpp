class Solution {
public:
    bool isAlienSorted(vector<string>& Words, string order) {
        unordered_map<char,int> mp;
        for (int i = 0; i < order.size(); i++)  mp[order[i]] = i;
        
        for (int i = 1; i < Words.size(); i++) {
            string a = Words[i-1], b = Words[i];
            for (int j = 0; j < a.size(); j++) {
                if (j == b.size()) return false;
                char achar = a[j], bchar = b[j];
                if (mp[achar] < mp[bchar]) break;
                if (mp[achar] > mp[bchar]) return false;
            }
        }
        return true;

    }
};