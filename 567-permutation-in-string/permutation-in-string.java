class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] s1Arr = new int[26];
        int[] s2Arr = new int[26];

        if(s1.length() > s2.length())
            return false;

        //match the length of the array
        for(int i =0; i < s1.length(); i++)
        {
            s1Arr[s1.charAt(i) - 'a']++;
            s2Arr[s2.charAt(i) - 'a']++;
        }

        if(equalize(s1Arr, s2Arr))
            return true;

        int left = 0;
        for(int right = s1.length(); right < s2.length(); right++)
        {
            s2Arr[s2.charAt(right) - 'a']++;
            s2Arr[s2.charAt(left) - 'a']--;
            if(equalize(s1Arr, s2Arr))
                return true;
            
            left++;
        
        }
        return false;
    }

    private boolean equalize(int[] s1Arr, int[] s2Arr)
    {
        for(int i =0; i < s1Arr.length; i++)
        {
            if(s1Arr[i] != s2Arr[i])
                return false;
        }
        return true;
    }
}