class Solution {
    public int countSubstrings(String s) {
        int size = 0;

        for(int i = 0; i < s.length(); i++)
        {
            int odd = expand(s, i, i);
            int even = expand(s, i, i+1);
            size += odd;
            size += even;
        }
        return size;

    }

    private int expand(String s, int l, int r)
    {
        ArrayList<String> temp = new ArrayList<>();
        while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r))
        {
            temp.add(s.substring(l, r + 1));
            l--;
            r++;
        }
        return temp.size();
    }
}