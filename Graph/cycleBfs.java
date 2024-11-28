package Graph;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Node {
    int first;
    int second;
    public Node(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

public class cycleBfs {
// detect cycle in undirected graph
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] vis = new boolean[V];
        Arrays.fill(vis,false);
        int[] parent = new int[V];
        Arrays.fill(parent,-1);
        for (int i = 0; i<V; i++){
            if (!vis[i]){
                if (checkForCycle(adj, i , vis, parent))
                    return true;
            }
        }
        return false;
    }

    private boolean checkForCycle(ArrayList<ArrayList<Integer>> adj, int s, boolean[] vis, int[] parent) {
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(s,-1));
        vis[s] = true;
        while(!q.isEmpty()){
            int node = q.peek().first;
            int par = q.peek().second;
        }
    }
}
