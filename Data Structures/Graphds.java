package Data_structure;
import java.util.*;
public class Graphds {
    // BASICS
    //Directional edge A -> B here A and B are nodes
    //Bi-diectional or undirectional edge A<=> B
    // weighted edge A-10-B
    //unweighted A--B 
    Graphds(){
        int V=4;
        ArrayList<Edge> graph[]=new ArrayList[V];
        createGraph(graph);
    }
    // Using Array of ArrayList
    public static class Edge{
            public int src;
            public int dest;
            public int weight;
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
    // public static void createGraphW(ArrayList graph[]){
    //     for(int i=0;i<graph.length;i++){
    //         graph[i]=new ArrayList<Edge>();
    //     }
    //     graph[0].add(new Edge(0,2,2));

    //     graph[1].add(new Edge(1,2,10));
    //     graph[1].add(new Edge(1,3,0));

    //     graph[2].add(new Edge(2,0,2));
    //     graph[2].add(new Edge(2,1,10));
    //     graph[2].add(new Edge(2,3,-1));

    //     graph[3].add(new Edge(3,1,0));
    //     graph[3].add(new Edge(3,2,-1));
    // }   
    
        
    // public static void main(String[] args){

    //     // Using Array of ArrayList

        
    //     // createGraphW(graph);
    //     for(int i=0;i<graph[1].size();i++){
    //         Edge e = graph[1].get(i);
    //         System.out.println(e.dest+" "+e.weight);
    //         }
    //         BFS(graph, V);
    //         boolean vis[]=new boolean[V];
    //         DFS(graph,vis,0);
    //     // Using Adjacency Matrix
    //     //int[][] graph= new int[V][V];
        
    // }
    // //BFS : breadth first search
    // // uses queue
    // public static void BFS(ArrayList<Edge> graph[], int V){
    //     Queue<Integer> q= new LinkedList<>();
    //     boolean vis[] = new boolean[V];
    //     q.add(0);
    //     while(!q.isEmpty()){ 
    //         int curr =  q.remove();
    //         if(vis[curr]==false){
    //             System.out.print(curr+" ");
    //             vis[curr]=true;
    //             for(int i=0;i<graph[curr].size();i++){
    //                 Edge e = graph[curr].get(i);
    //                 q.add(e.dest);
    //             }
    //         }
            

    //     }
    //     System.out.println();
    // }
    // // DFS : Depth First Search
    // // uses stack
    // public static void DFS(ArrayList<Edge> graph[],boolean vis[],int curr){
    //     System.out.print(curr+" ");
    //     vis[curr]=true;
    //     for(int i=0;i<graph[curr].size();i++){
    //         Edge e =graph[curr].get(i);
    //         if(vis[e.dest]==false){
    //             DFS(graph, vis, e.dest);
    //         }
    //     }
    // }
}
