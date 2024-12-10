import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class DijkstraAlgorithm {
    public static int[] findPathsFromSource(int matrix[][],int src){
        int ans[]=new int[matrix.length];
        Arrays.fill(ans,Integer.MAX_VALUE);
        ans[src]=0;
        Queue<Integer> q =new LinkedList<>();
        q.add(src);
        while(!q.isEmpty()){
            int onNode = q.remove();
            int goToArr[]=matrix[onNode];
            for( int i=0;i<goToArr.length;i++ ){
               if(goToArr[i]!=-1){
                   int toNode = i;
                   if( ans[toNode] > ans[onNode]+goToArr[i] ){
                       ans[ toNode ] = ans[onNode]+goToArr[i];
                       if( !q.contains( toNode ) ) q.add( toNode );
                   }
               }
            }
        }
        return ans;
    }
}
