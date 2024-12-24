
import java.util.Arrays;
import java.util.List;

public class ConvertIntToIntegerArray {



    public void convert(){

        int[] arr = {2,5,7,8,3,6,4};

        Integer[] convertedArr = Arrays.stream(arr)
            .boxed()
            .toArray(Integer[]::new);

            List<Integer> list = Arrays.asList(convertedArr);

            list.stream().sorted().forEach(System.out::println);

    }



    public static void main(String args[]){

        ConvertIntToIntegerArray convertIntToIntegerArray = new ConvertIntToIntegerArray();
        convertIntToIntegerArray.convert();
    }
    
}
