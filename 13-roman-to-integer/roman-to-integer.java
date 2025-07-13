class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> roman = new HashMap<>();

        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        int count = 0;
        int n = s.length() - 1;
        int curr = roman.get(s.charAt(n));
        count += curr;
        int prev = Integer.MIN_VALUE;
        for(int i = n -1; i >= 0; i--)
        {
            prev = curr;
            curr = roman.get(s.charAt(i));
            if(curr >= prev)
                count += curr;
            else
                count -= curr;
            

        }
        return count;
    }
}