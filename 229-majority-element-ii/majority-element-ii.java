class Solution {
    public List<Integer> majorityElement(int[] nums) {
       Integer num1 = null;
       Integer num2 = null;
       int count1 = 0;
       int count2 = 0;

       for(int i: nums)
       {
        if(num1 != null && num1 == i)
            count1++;
        else if(num2 != null && num2 == i)
            count2++;
        else if(count1 == 0)
        {
            num1 = i;
            count1 = 1;
        }
        else if(count2 == 0)
        {
            num2 = i;
            count2 = 1;
        }
        else{
            count1--;
            count2--;
        }
       }

       count1 =0;
       count2 = 0;

       for(int i : nums)
       {
        if(num1 == i)
            count1++;
        else if(num2 == i)
            count2++;
       }


       List<Integer> temp = new ArrayList<>();
       if(count1 > nums.length/3) temp.add(num1);
       if(count2 > nums.length/3) temp.add(num2);
       return temp;
        
    }
}