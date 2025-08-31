class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if(digits == null || digits.length() == 0) return ans;
        String[] map = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        helper(ans, digits, 0, new StringBuilder(), map);
        return ans;
    }

    void helper(List<String> ans, String digits, int index, StringBuilder path, String[] map)
    {
        if(path.length() == digits.length())
        {
            ans.add(path.toString());
            return;
        }
        String temp = map[digits.charAt(index) - '0'];
        for(int i =0; i < temp.length(); i++)
        {
            path.append(temp.charAt(i));
            helper(ans, digits, index +1, path, map);
            path.deleteCharAt(path.length() - 1);

        }
    }

}