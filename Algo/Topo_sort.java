package Algo;
import java.util.*;
public class Topo_sort {
    // Used only for DAG(Directed acyclic garph)
    public static class Edge{
            int src;
            int dest;
            int weight;
        // for unweight
        Edge(int src,int dest){
            this.src=src;
            this.dest=dest;
        }
        Edge(int src,int dest,int weight){
            this.src=src;
            this.dest=dest;
            this.weight=weight;
        }
    } 
    public static void createGraph(ArrayList graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,2));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,2));
    }    
    public static void main(String[] args){
        int V=4;
        ArrayList<Edge> graph[]=new ArrayList[V];
        
        createGraph(graph);
         boolean vis[]= new boolean[V];
        System.out.println(isCycle(graph, vis, 0, -1));
        
        
        
    }
    // Topological sorting
    public static void TOPO(ArrayList<Edge> graph[],boolean vis[],int curr,Stack<Integer> s){
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e =graph[curr].get(i);
            if(!vis[e.dest]){
                TOPO(graph, vis, e.dest, s);
            }
        }
        s.push(curr);
    }
    public static void Topo(ArrayList<Edge> graph[],int V){
        boolean vis[]= new boolean[V];
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<V;i++){
            if(!vis[i]){
                TOPO(graph, vis, i, s);
            }
            while(!s.isEmpty()){
                System.out.print(s.pop()+" ");
            }
        }
    }
    //Cycle in graph
    public static boolean isCycle(ArrayList<Edge> graph[],boolean vis[],int curr,int par){
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e =graph[curr].get(i);
            if(vis[e.dest]&&e.dest!=par){
                return true;
            }
            else if(!vis[e.dest]){
                if(isCycle(graph, vis, e.dest, curr)){
                    return true;
                }
            }

        }
        return false;
    }
}
