class Solution {
    public boolean checkIfPangram(String sentence) {
        int ans[] = new int[26];
        for(int i = 0; i < sentence.length(); i++)
        {
            ans[sentence.charAt(i) - 'a']++;
        }

        for(int i = 0; i < ans.length; i++)
        {
            if(ans[i] < 1)
                return false;
        }
        return true;
    }
}