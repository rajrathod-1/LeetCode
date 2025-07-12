class Solution {
    public String frequencySort(String s) {
        StringBuilder ans = new StringBuilder();
        HashMap<Character, Integer> hm =  new HashMap<>();

        for(char i : s.toCharArray())
        {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }

        ArrayList<Character> list = new ArrayList<>(hm.keySet());
        list.sort((obj1, obj2) -> hm.get(obj2) - hm.get(obj1));

        for(char ch: list)
        {
            for(int i = 0; i < hm.get(ch); i++)
            {
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}