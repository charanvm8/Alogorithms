package geekForGeeks.graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class Practice1 {

    public static void BFS(ArrayList<ArrayList<Integer>> graph, boolean[] visited, int index) {
        Deque<Integer> q = new ArrayDeque<>();
        q.add(index);
        while (!q.isEmpty()) {
            int curr = q.poll();
            System.out.println(curr+" ");
            visited[curr] = true;
            for (int i = 0; i < graph.get(curr).size(); i++) {
                if (!visited[graph.get(curr).get(i)]) {
                    q.add(graph.get(curr).get(i));
                }
            }
        }
    }

    public static int BFS(ArrayList<ArrayList<Integer>> graph) {
        boolean[] visited = new boolean[graph.size()];
        int counter = 0;
        for (int i = 0; i < graph.size(); i++) {
            if (!visited[i]) {
                BFS(graph, visited, i);
                counter++;
            }
        }
        return counter;
    }

    public static void DFS(ArrayList<ArrayList<Integer>> graph) {
        boolean[] visited = new boolean[graph.size()];
        for (int i = 0; i < graph.size(); i++) {
            if (!visited[i]) {
                DFS(graph, visited, i);
            }
        }
    }


    public static void DFS(ArrayList<ArrayList<Integer>> graph, boolean[] visited, int index) {
        System.out.println(index);
        visited[index] = true;
        for (int i = 0; i < graph.size(); i++) {
            if (!visited[i]) {
                DFS(graph, visited, i);
            }
        }
    }




    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(3);
        graph.get(3).add(4);

        DFS(graph);

    }
}
