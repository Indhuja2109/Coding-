import java.util.*;

class Solution {
    void bfs(int src, int[] dist, int[] edges, int n) {
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        dist[src] = 0;
        while (!q.isEmpty()) {
            int p = q.poll();
            if (edges[p] != -1 && dist[edges[p]] == Integer.MAX_VALUE) {
                q.add(edges[p]);
                dist[edges[p]] = dist[p] + 1;
            }
        }
    }

    public int closestMeetingNode(int[] edges, int node1, int node2) {
        int n = edges.length;
        int[] dist1 = new int[n];
        int[] dist2 = new int[n];
        
        Arrays.fill(dist1, Integer.MAX_VALUE);
        Arrays.fill(dist2, Integer.MAX_VALUE);
        
        bfs(node1, dist1, edges, n);
        bfs(node2, dist2, edges, n);

        int res = Integer.MAX_VALUE, node = -1;
        for (int i = 0; i < n; i++) {
            if (dist1[i] == Integer.MAX_VALUE || dist2[i] == Integer.MAX_VALUE) continue;
            int maxDist = Math.max(dist1[i], dist2[i]);
            if (res > maxDist) {
                node = i;
                res = maxDist;
            }
        }
        return node;
    }
}
