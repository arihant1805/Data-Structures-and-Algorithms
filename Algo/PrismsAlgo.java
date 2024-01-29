package Algo;
import java.util.ArrayList;
import java.util.PriorityQueue;
import Algo.Topo_sort.Edge;
public class PrismsAlgo {
    static class Pair implements Comparable<Pair> {
    int v;
    int wt;
    public Pair(int v, int wt) {
        this.v = v;
        this.wt = wt;
        }
    @Override
    public int compareTo(Pair p2) {
        return this.wt - p2.wt;
        }
    }
//O(ElogE)
public static void primAlgo(ArrayList<Edge> graph[]) {
    boolean vis[] = new boolean[graph.length];
    PriorityQueue<Pair> pq = new PriorityQueue<>();
    pq.add(new Pair(0, 0));
    int cost = 0;
    while(!pq.isEmpty()) {
        Pair curr = pq.remove();
        if(!vis[curr.v]) {
            vis[curr.v] = true;
            cost += curr.wt;
            for(int i=0; i<graph[curr.v].size(); i++) {
                Edge e = graph[curr.v].get(i);
                if(!vis[e.dest]) {
                    pq.add(new Pair(e.dest, e.weight));
                    }
                }
            }
        }
    System.out.println(cost);
    }
}

