
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MergeIntervals {

    private void merge(int[][] intervals) {

        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new LinkedList<>();

        merged.add(intervals[0]);

        for (int i=1; i< intervals.length; i++) {
            int[] current = intervals[i];
            int[] lastMerged = merged.get(merged.size() - 1);

            if(current[0] <= lastMerged[1]){
                lastMerged[1] = Math.max(lastMerged[1], current[1]);

            }else{
                merged.add(current);
            }
        }

        merged.stream().forEach(arr -> System.err.println("{" + arr[0] + "," + arr[1] + "}"));

    }


    public static void main(String[] args) {

        int[][] intervals = {{1, 3}, {2, 4}, {5, 7}, {6, 8}};

        MergeIntervals mergeIntervals = new MergeIntervals();
        mergeIntervals.merge(intervals);
                
            }
        
      
}
