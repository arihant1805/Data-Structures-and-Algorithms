package Algo;
import java.util.ArrayList;
import java.util.PriorityQueue;
public class DijkstrasAlgorithm {
    // to find shortest distance of every point from the source
    public static class Pair implements Comparable<Pair> {
        int node;
        int dist;
        public Pair(int n ,int d){
            this.node=n;
            this.dist=d;
        }

        @Override
        public int compareTo(Pair p2){
            return this.dist-p2.dist;
        }
    }
    public static void dijkstra(ArrayList<Edge> graph[],int src,int V){
        PriorityQueue<Pair> pq =new PriorityQueue<>();
        int dist[]=new int[V];
        for(int i=0;i<V;i++){
            if(i!=src){
                dist[i]=Integer.MAX_VALUE;
            }
        }
        boolean vis[]=new boolean[V];

        pq.add(new Pair(0,0));
        while(!pq.isEmpty()){
            Pair curr = pq.remove();
            if(!vis[curr.node]){
                vis[curr.node]=true;
                for(int i=0;i<graph[curr.node].size();i++){
                    Edge e = graph[curr.node].get(i);
                    int u=e.src,v=e.dest;
                    if(dist[u]+e.weight<dist[v]){
                        dist[v]=dist[u]+e.weight;
                        pq.add(new Pair(v,dist[v]));
                    }

                }
            }
        }
        for(int i=0;i<V;i++){
            System.out.print(dist[i]+" ");
        }
    }
}
