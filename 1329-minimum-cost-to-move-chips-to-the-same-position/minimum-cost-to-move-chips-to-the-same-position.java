class Solution {
    public int minCostToMoveChips(int[] position) {
        int even = 0;
        int odd = 0;
        for(int a : position)
        {
            if(a%2 ==0)
            {
                even++;
            }
            else{
                odd++;
            }

            
        }
        return Math.min(even, odd);
    }
}