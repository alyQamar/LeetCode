class Solution {
public:
   
map<char, char> mp = {{'{', '}'}, {'[', ']'}, {'(', ')'}};


bool isValid(string s)
{
  stack<char> st;
  if (s.length() % 2 != 0)
  {
    return false;
  }

  for (int i = 0; i < s.length(); i++)
  {
    if (openParentheses(s[i]))
    {
      st.push(s[i]);
    }
    else
    {
      if (!st.empty() && mp[st.top()] == s[i])
      {
        st.pop();
      }
      else
      {
        return false;
      }
    }
  }
  if (st.empty())
  {
    return true;
  }
  return false;
}
bool openParentheses(char c1)
{
  if (c1 == '{' || c1 == '[' || c1 == '(')
  {
    return true;
  }
  return false;
}
};