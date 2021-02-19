import java.util.Arrays;
import java.util.List;

public class demo4filter {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(11,23,32,4,55,66,78,86,99,100);
        /**
         * If we want to only print the values by our condition in that case we have to use filter
         * it's like if condition
         * we're telling stream to add only those values whose condition is matched
         */
        System.out.println(arr.stream().filter(i -> i%5==0).reduce(0, (c,e) -> c+e));
    }
}