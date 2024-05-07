class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> temp = new ArrayList<Boolean>(candies.length);
        for(int i = 0; i < candies.length; i++)
        {
            boolean tempBool = true;
            candies[i] = candies[i] + extraCandies;
            for(int j = 0; j < candies.length; j++)
            {
                int max = candies[i];
                if(max < candies[j])
                {
                    tempBool = false;
                }
            }

            temp.add(tempBool);
            candies[i] = candies[i] - extraCandies;
        }
        
        return temp;
    }
}