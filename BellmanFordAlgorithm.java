import java.util.Arrays;

public class BellmanFordAlgorithm {
    public static int[] findPathsFromSource(int edges[][], int src, int n){
        int ans[]=new int[n];
        Arrays.fill(ans,Integer.MAX_VALUE);
        ans[src]=0;
        for(int i=1;i<n;i++){
            boolean up = false;
            for(int j=0;j<edges.length;j++){
                int u = edges[j][0];
                int v = edges[j][1];
                int w = edges[j][2];
                //u -> v
                if( ans[v]!=Integer.MAX_VALUE && ans[u] > ans[v] + w ){
                    ans[u] =  ans[v] + w;
                    up = true;
                }
                //v -> u
                if( ans[u]!=Integer.MAX_VALUE &&  ans[v] > ans[u] + w ){
                    ans[v] =  ans[u] + w;
                    up = true;
                }
            }
            if(!up) {
                break;
            }
        }
        return ans;
    }
}
