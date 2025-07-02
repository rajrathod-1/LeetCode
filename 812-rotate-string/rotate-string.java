class Solution {
    public boolean rotateString(String s, String goal) {
        char[] sToChar = s.toCharArray();
        for(int i = 0; i < s.length(); i++)
        {
            char[] temp = new char[s.length()];
            for(int j =0; j < s.length(); j++)
            {
                temp[(j + i) % s.length()] = sToChar[j];
            }
            if(goal.equals(new String(temp))) return true;
        }
        return false;
    }

}