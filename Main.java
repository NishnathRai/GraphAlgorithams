import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int matrix[][]={
                {0,1,5},{0,2,5},{0,4,2},{4,3,2},{1,3,5},{2,3,5}
        };
        matrix = makeMatrix(matrix,5);
    }

    public static int[][] makeMatrix(int[][] matrix,int n) {
        int ans[][]=new int[n][n];
        for(int arr[]:ans) Arrays.fill(arr,-1);
        for(int arr[]:matrix){
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