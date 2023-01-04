class Solution {
public:
    string longestCommonPrefix(vector<string> &strs)
{
  vector<int> v;
  string res = "";
  sort(strs.begin(), strs.end(), compare);
  string sBase = strs[0];
  for (auto s : strs)
  {
    int cnt = 0;
    for (int i = 0; i < sBase.length(); i++)
    {
      if (s[i] == sBase[i])
      {
        cnt++;
      }
      else
      {
        break;
      }
    }
    v.push_back(cnt);
  }
  sort(v.begin(), v.end());
  for (int i = 0; i < v.front(); i++)
  {
    res += sBase[i];
  }
  return res;
}

static bool compare(string s1, string s2)
{
  return (s1.length() < s2.length());
}
};