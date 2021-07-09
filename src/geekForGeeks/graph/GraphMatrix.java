package geekForGeeks.graph;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class GraphMatrix {

    public static void insert(ArrayList<ArrayList<Integer>> graph,int edge1,int edge2){
        graph.get(edge1).add(edge2);
        graph.get(edge2).add(edge1);
    }

    public static void BFS(ArrayList<ArrayList<Integer>> graph, int node,boolean[] visited){
        Deque<Integer> queue = new ArrayDeque<>();
        queue.add(node);
        visited[node] = true;
        while(!queue.isEmpty()){
            int currNode = queue.poll();
            System.out.println(currNode);
            for(int i:graph.get(currNode)){
                if(visited[i]==false){
                    visited[i] = true;
                    queue.offer(i);
                }
            }
        }
    }

    // Space complexity O(V)
    // Time complexity O(V+E)
    public static void BFSDis(ArrayList<ArrayList<Integer>> graph,int size){
        boolean[] visited = new boolean[size];
        int counter = 0;
        for(int i=0;i<size;i++){
            if(visited[i] = false){
                counter++;
                BFS(graph,i,visited);
            }
        }
    }

    public static void DFS(ArrayList<ArrayList<Integer>> graph,int node){
        boolean[] visited = new boolean[graph.size()];
        DFSRec(graph,node,visited);
    }

    public static void DFSRec(ArrayList<ArrayList<Integer>> graph,int node,boolean[] visited){
        visited[node] = true;
        System.out.println(node);
        for(int i: graph.get(node)){
            if(visited[i] == false){
                DFSRec(graph,i,visited);
            }
        }
    }

    public static void shortestPath(ArrayList<ArrayList<Integer>> graph,int node){
        int[] distance = new int[graph.size()];
        boolean[] visited = new boolean[graph.size()];
        distance[node] = 0;
        shortestPath(graph,0,visited,distance);
        for(int i:distance){
            System.out.println(i+" ");
        }
    }

    public static void shortestPath(ArrayList<ArrayList<Integer>> graph,int node,boolean[] visited,int[] distance){
        visited[node] = true;
        for(int i:graph.get(node)){
            distance[i] = distance[node]+1;
            shortestPath(graph,i,visited,distance);
        }
    }


    public static void shortestPathBFS(ArrayList<ArrayList<Integer>> graph,int size,int path){
        int[] distance = new int[size];
        boolean[] visited = new boolean[size];
        distance[path] = 0;
        Deque<Integer> queue = new ArrayDeque();
        queue.add(path);
        while(!queue.isEmpty()){
            int curr = queue.poll();
            visited[curr] = true;
            for(int i:graph.get(curr)){
                if(visited[i] == false){
                    distance[i] = distance[curr]+1;
                    queue.add(i);
                }
            }
        }

        for(int i:distance){
            System.out.println(i+" ");
        }
    }

    public static boolean detectCycleBFS(ArrayList<ArrayList<Integer>> graph, int size,int root){
        if(size==0){
            return false;
        }
        int[] parent = new int[size];
        boolean[] visited = new boolean[size];
        parent[root] = -1;
        visited[root] = true;
        Deque<Integer> queue = new ArrayDeque();
        while(!queue.isEmpty()){
            int curr = queue.poll();
            for(int edge : graph.get(curr)){
                if(visited[edge]==false){
                    visited[edge] = true;
                    parent[edge] = curr;
                    queue.add(edge);
                }
                else if(edge!=parent[edge]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void topologicalSort(ArrayList<ArrayList<Integer>> graph,int size){
        int[] infix = new int[size];
        for(int i=0;i<size;i++){
            for(int z:graph.get(i)){
                infix[z]++;
            }
        }
        Deque<Integer> queue = new ArrayDeque();
        for(int i=0;i<size;i++){
            if(infix[i]==0){
                queue.add(i);
            }
        }
        while(!queue.isEmpty()){
            int currVertex = queue.pop();
            System.out.println(currVertex+" ");
            for(int vertex:graph.get(currVertex)){
                if(infix[vertex]==1){
                    queue.offer(vertex);
                }
                infix[vertex]--;
            }
        }
    }


    public static boolean detectCycleInDirectedBFS(ArrayList<ArrayList<Integer>> graph,int size){
        int[] infix = new int[size];
        for(int i=0;i<size;i++){
            for(int z:graph.get(i)){
                infix[z]++;
            }
        }
        Deque<Integer> queue = new ArrayDeque();
        for(int i=0;i<size;i++){
            if(infix[i]==0){
                queue.add(i);
            }
        }
        int vertices = 0;
        while(!queue.isEmpty()){
            int currVertex = queue.pop();
            vertices++;
            for(int vertex:graph.get(currVertex)){
                infix[vertex]--;
                if(infix[vertex]<=0){
                    queue.offer(vertex);
                }
            }
        }
        return vertices!=size;
    }




    public static void topologicalSortDFS(ArrayList<ArrayList<Integer>> graph) {

    }




    public static void main(String[] args) {
//        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
//        insert(graph,1,2);
//        BFSDis(graph, 0);
//        DFS(graph,0);
//        shortestPathBFS(graph,10,0);
//        topologicalSort(graph,10);

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i=0;i<5;i++){
            graph.add(new ArrayList<>());
        }
        graph.get(0).add(1);
//        graph.get(0).add(3);
//        graph.get(1).add(3);
//        graph.get(1).add(4);
//        graph.get(2).add(3);
//        graph.get(2).add(0);
        graph.get(4).add(1);
        graph.get(3).add(1);
        graph.get(1).add(2);
        graph.get(2).add(1);
        graph.get(2).add(3);


        topologicalSort(graph,5);
        System.out.println(detectCycleInDirectedBFS(graph,5));

//        int[] matrix = {1,2,3,4,5};
//        matrix[2]--;
//        for(int i:matrix){
//            System.out.println(i);
//        }


    }
}
