class Solution {
    static int count = 0;
    public int numberOfSteps(int num) {
        if(num == 0)
        {
            return 0;  
        }
        else if(num % 2 ==0)
        {
            count++;
            return 1 + numberOfSteps(num/2);
        }
        else{
            count++;
            return 1 + numberOfSteps(num - 1);
        }
    }
}