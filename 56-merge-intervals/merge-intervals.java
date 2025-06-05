class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, new Comparator<int[]>(){
            public int compare(int a[], int b[])
            {
                return Integer.compare(a[0], b[0]);
            }
        });

        ArrayList<int[]> ans = new ArrayList<>();
        boolean[] merged = new boolean[intervals.length];

        for(int i = 0; i < intervals.length; i++)
        {
            if(merged[i]) continue;

            int start = intervals[i][0];
            int end = intervals[i][1];

            for(int j = 0; j < intervals.length; j++)
            {
                if(i!=j && !merged[j])
                {
                    if(start <= intervals[j][0] && end >= intervals[j][0])
                    {
                        start = Math.min(start, intervals[j][0]);
                        end = Math.max(end, intervals[j][1]);
                        merged[j] = true;
                    }
                }
            }

            ans.add(new int[]{start, end});

        }

        return ans.toArray(new int[0][]);


        
    }
}