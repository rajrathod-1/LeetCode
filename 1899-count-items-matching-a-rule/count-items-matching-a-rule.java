class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index = Integer.MIN_VALUE;
        if(ruleKey.equals("type"))
        {
            index = 0;
        }
        if(ruleKey.equals("color"))
        {
            index = 1;
        }
        if(ruleKey.equals("name"))
        {
            index = 2;
        }
        int count = 0;
        for(int i =0; i < items.size(); i++)
        {
            if(items.get(i).get(index).equals(ruleValue))
            {
                count++;
            }
        }
        return count;
    }
}