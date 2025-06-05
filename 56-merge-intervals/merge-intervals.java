class Solution {
    public static int[][] merge(int[][] intervals) {
        List<int[]> result = new ArrayList<>();
        boolean[] merged = new boolean[intervals.length];

        Arrays.sort(intervals, new Comparator<int[]>(){
            public int compare(int[] a, int[] b)
            {
                return Integer.compare(a[0], b[0]);
            }
        });
        for (int i = 0; i < intervals.length; i++) {
            if (merged[i]) continue;

            int start = intervals[i][0];
            int end = intervals[i][1];

            for (int j = 0; j < intervals.length; j++) {
                if (i != j && !merged[j]) {
                    if (intervals[j][0] <= end && intervals[j][1] >= start) {
                        start = Math.min(start, intervals[j][0]);
                        end = Math.max(end, intervals[j][1]);
                        merged[j] = true;
                    }
                }
            }

            result.add(new int[]{start, end});
        }

        return result.toArray(new int[result.size()][]);
    }
}