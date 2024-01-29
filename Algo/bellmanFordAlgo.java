package Algo;

import java.util.ArrayList;

public class bellmanFordAlgo {
    // uses dynamic programming
    public static void bellmanFord(ArrayList<Edge> graph[], int src) {
    int dist[] = new int[graph.length];
    for(int i=0; i<dist.length; i++) {
        if(i != src)
        dist[i] = Integer.MAX_VALUE;
    }
    //O(V)
    for(int i=0; i<graph.length-1; i++) {
        //edges - O(E)
        for(int j=0; j<graph.length; j++) {
            for(int k=0; k<graph[j].size(); k++) {
                Edge e = graph[j].get(k);
                int u = e.src;
                int v = e.dest;
                int wt = e.wt;
                if(dist[u] != Integer.MAX_VALUE && dist[u]+wt < dist[v]) {
                dist[v] = dist[u] + wt;
                }
            }
        }
    }
    //Detecting Negative Weight Cycle
    for(int j=0; j<graph.length; j++) {
        for(int k=0; k<graph[j].size(); k++) {
            Edge e = graph[j].get(k);
            int u = e.src;
            int v = e.dest;
            int wt = e.wt;
            if(dist[u] != Integer.MAX_VALUE && dist[u]+wt < dist[v]) {
            System.out.println("negative weight cycle exists");
            break;
            }
        }
    }
    for(int i=0; i<dist.length; i++) {
        System.out.print(dist[i]+" ");
    }
    System.out.println();
    }
}
