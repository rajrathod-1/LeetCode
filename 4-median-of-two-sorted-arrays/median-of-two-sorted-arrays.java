class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> temp = new ArrayList<>();
        double median = 0.0;

        for(int i = 0; i < nums1.length; i++)
        {
            temp.add(nums1[i]);
        }
        for(int i = 0; i < nums2.length; i++)
        {
            temp.add(nums2[i]);
        }

        Collections.sort(temp);
        if(temp.size() %2 != 0)
        {
            median = temp.get(temp.size()/2);

        }
        else{
            int first = temp.size()/2;
            int second = temp.size()/2 - 1;
            median = (temp.get(first) + temp.get(second))/2.0;
        }
        return median;
    }
}