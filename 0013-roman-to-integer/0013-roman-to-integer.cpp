class Solution {
public:

int romanToInt(string s)
{
  int res = 0;
  // create map of Symbol and equivalent value of symbols
  map<char, int> mp = {// This equals sign is optional
                       {'I', 1},
                       {'V', 5},
                       {'X', 10},
                       {'L', 50},
                       {'C', 100},
                       {'D', 500},
                       {'M', 1000}};

  for (int i = 0; i < s.length(); i++)
  {
    if (i != s.length() - 1 && (s[i] == 'I' || s[i] == 'X' || s[i] == 'C') && mp[s[i]] < mp[s[i + 1]])
    {
      if (mp[s[i + 1]] <= mp[s[i]] * 10)
      {
        res += mp[s[i + 1]] - mp[s[i]];
        i++;
      }
    }
    else
    {
      int x = s.length() - i;
      res += mp[s[i]];
    }
  }
  return res;
}
};