
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class FindMissingNumber {

    public void findMissingNumber(int[] arr){

        Set<Integer> set = Arrays.stream(arr)
              .boxed()
              .collect(Collectors.toSet());

              Integer min= Integer.MAX_VALUE;
              Integer max = Integer.MIN_VALUE;

              for(int item: arr){
                if (item < min) {
                    min = item;
                }
                if(item > max){
                    max = item;
                }

              }

              for (int i=min; i<=max; i++) {

                if(!set.contains(i)){
                    System.out.println("Missing NUmber is "+ i);
                }
                  
              }
    }


    public static void main(String[] args) {
        
        int[] arr  = {2,5,6,3,4,8};

        FindMissingNumber findMissingNumber = new FindMissingNumber();

        findMissingNumber.findMissingNumber(arr);
    }
    
}
