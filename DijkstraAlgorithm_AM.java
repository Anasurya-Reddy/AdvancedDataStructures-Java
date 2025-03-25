import java.util.Scanner;

public class DijkstraAlgorithm_AM {
    static final int INF = 999; // Using 999 as infinity
    private static int chooseMinVertex(int[] dist, boolean[] S, int n) {
        int minIndex = -1, min = INF;
        for (int i = 0; i < n; i++)
            if (!S[i] && dist[i] < min) {
                min = dist[i];
                minIndex = i;
            }
        return minIndex;
    }

    public static void shortestPaths(int v, int[][] cost, int[] dist, int n) {
        boolean[] S = new boolean[n];

        // Step 1: Initialize distances from the source
        for (int i = 0; i < n; i++)
            dist[i] = cost[v][i];

        dist[v] = 0; // Source vertex has distance 0
        S[v] = true;

        // Step 2: Process the remaining n-1 vertices
        for (int num = 1; num < n; num++) {
            int u = chooseMinVertex(dist, S, n);
            if (u == -1) break; // No more reachable vertices

            S[u] = true;

            // Step 3: Relaxation process
            for (int w = 0; w < n; w++)
                if (!S[w] && cost[u][w] != INF && dist[u] + cost[u][w] < dist[w])
                    dist[w] = dist[u] + cost[u][w];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of vertices: ");
        int n = sc.nextInt();
        int[][] cost = new int[n][n];

        System.out.println("Enter cost adjacency matrix (Use 999 for INF):");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                cost[i][j] = sc.nextInt();

        System.out.print("Enter source vertex: ");
        int source = sc.nextInt();
        int[] dist = new int[n];

        shortestPaths(source, cost, dist, n);

        System.out.println("Shortest distances from source " + source + ":");
        for (int i = 0; i < n; i++)
            System.out.println("Vertex " + i + " : " + (dist[i] == INF ? "INF" : dist[i]));

        sc.close();
    }
}
