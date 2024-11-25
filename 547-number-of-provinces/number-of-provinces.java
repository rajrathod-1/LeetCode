class Solution {
    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>> adjLs = new ArrayList<>();
        for(int i = 0; i < isConnected.length; i++)
        {
            adjLs.add(new ArrayList<Integer>());
        }

        for(int i = 0; i < isConnected.length; i++)
        {
            for(int j =0; j < isConnected.length; j++)
            {
                if(isConnected[i][j] == 1 && i != j)
                {
                    adjLs.get(i).add(j);
                    adjLs.get(j).add(i);
                }
            }
        }

        int[] vis = new int[isConnected.length];
        int cnt = 0;
        for(int i = 0; i < isConnected.length; i++)
        {
            if(vis[i] == 0)
            {
                cnt++;
                dfs(i, adjLs, vis);
            }
        }
        return cnt;
        
    }

    void dfs(int node, ArrayList<ArrayList<Integer>> adjLs, int[] vis)
    {
        vis[node] = 1;
        for(Integer it: adjLs.get(node))
        {
            if(vis[it] == 0)
            {
                dfs(it, adjLs, vis);
            }
        }
    }
} 