import java.util.Arrays;
import java.util.List;

public class demo3stream {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        /**
         * Using stream we can reduced mutation and increased execution speed
         * first we need to convert list to stream 
         * then we can map the values in stream and do our opertaion
         * after we can either print the values using forEach
         * or we can further implement our logic using various functions like reduce,filter
         */
        //System.out.println(arr.stream().map(i -> i*2).reduce(0, (c,e) -> c+e));
        System.out.println(arr.stream().map(i -> i*2).reduce(0, Integer::sum));
        //arr.stream().map(i -> i*2).forEach(i -> System.out.println(i));
    }
}
