// Last updated: 09/07/2026, 15:05:59
class Solution {
    int nodes;
    int edgeCount;
    public int countCompleteComponents(int n, int[][] edges) {
        List<Integer>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int[] e : edges) {
            graph[e[0]].add(e[1]);
            graph[e[1]].add(e[0]);
        }
        boolean[] vis = new boolean[n];
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                nodes = 0;
                edgeCount = 0;
                dfs(i, graph, vis);
                edgeCount /= 2;
                if (edgeCount == nodes * (nodes - 1) / 2) {
                    ans++;
                }
            }
        }
        return ans;
    }
    private void dfs(int node, List<Integer>[] graph, boolean[] vis) {
        vis[node] = true;
        nodes++;
        edgeCount += graph[node].size();
        for (int nei : graph[node]) {
            if (!vis[nei]) {
                dfs(nei, graph, vis);
            }
        }
    }
}