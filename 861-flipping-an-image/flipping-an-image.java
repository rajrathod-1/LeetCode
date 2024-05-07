class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] temp = new int[image.length][image[0].length];
        int count = 0;
        for(int i =0; i < image.length; i++)
        {
            for(int j = image[i].length - 1; j >= 0; j--)
            {
                temp[i][count] = image[i][j];
                if(temp[i][count] == 0)
                {
                    temp[i][count] = 1;
                }
                else
                {
                    temp[i][count] = 0;
                }
                if(count >= image[i].length - 1)
                {
                    count = 0;
                }
                else
                {
                    count++;
                }
            }
        }

        return temp;
        
    }
}