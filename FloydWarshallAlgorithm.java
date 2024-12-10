public class FloydWarshallAlgorithm {
    public static int[] findPathsFromSource(int matrix[][],int n){
        int ans[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if (i==j) ans[i][j]=0;
                else if(matrix[i][j]==-1) ans[i][j]=Integer.MAX_VALUE;
                else ans[i][j] = matrix[i][j];
            }
        }


        for(int k=0;k<n;k++){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if( ans[i][k]!=Integer.MAX_VALUE && ans[k][j]!=Integer.MAX_VALUE && ans[i][j]>ans[i][k]+ans[k][j] ){
                        ans[i][j]=ans[i][k]+ans[k][j];
                    }
                }
            }
        }
        return ans[0];
    }
}
