class Solution {
    public int bestClosingTime(String customers) {
        int suffixSum = 0;
        int prefixSum = 0;

        for(int i = 0; i < customers.length(); i++)
        {
            char c = customers.charAt(i);
            if(c == 'Y')
                suffixSum++;
        }

        int minimumPen = suffixSum;
        int minimumHour = 0;

        for(int i =0; i < customers.length(); i++)
        {
            int pen = 0;
            char c = customers.charAt(i);
            if(c == 'N')
                prefixSum++;
            if(c == 'Y')
                suffixSum--;
            
            pen = prefixSum + suffixSum;
            if(pen < minimumPen)
            {
                minimumPen = pen;
                minimumHour = i + 1;
            }
        }
        return minimumHour;
    }
}