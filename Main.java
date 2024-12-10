import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {0, 1, 3}, {1, 0, 3}, // Bidirectional edge
                {0, 2, 5}, {2, 0, 5},
                {0, 4, 2}, {4, 0, 2},
                {1, 3, 6}, {3, 1, 6},
                {1, 5, 4}, {5, 1, 4},
                {2, 6, 7}, {6, 2, 7},
                {2, 7, 3}, {7, 2, 3},
                {3, 8, 5}, {8, 3, 5},
                {3, 9, 4}, {9, 3, 4},
                {4, 10, 6}, {10, 4, 6},
                {5, 11, 8}, {11, 5, 8},
                {6, 12, 2}, {12, 6, 2},
                {7, 13, 5}, {13, 7, 5},
                {8, 14, 9}, {14, 8, 9},
                {9, 15, 7}, {15, 9, 7},
                {10, 16, 4}, {16, 10, 4},
                {11, 17, 3}, {17, 11, 3},
                {12, 18, 6}, {18, 12, 6},
                {13, 19, 8}, {19, 13, 8},
                {14, 20, 5}, {20, 14, 5},
                {15, 21, 7}, {21, 15, 7},
                {16, 22, 2}, {22, 16, 2},
                {17, 23, 4}, {23, 17, 4},
                {18, 24, 3}, {24, 18, 3},
                {19, 25, 9}, {25, 19, 9},
        };
        matrix = makeMatrix(matrix,26);
    }

    public static int[][] makeMatrix(int[][] matrix,int n) {
        int[][] ans =new int[n][n];
        for(int[] arr :ans) Arrays.fill(arr,-1);
        for(int[] arr :matrix){
            int u = arr[0];
            int v = arr[1];
            int w = arr[2];
            ans[u][v]=w;
            ans[v][u]=w;
        }
        return ans;
    }
    public void pp(int m[][]){
        for(int arr[]:m) System.out.println(Arrays.toString(arr));
    }
}