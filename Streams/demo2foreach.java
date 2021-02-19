import java.util.Arrays;
import java.util.List;

public class demo2foreach {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        /**
         * Now we're going to iterate list using internal iteration
         * we're gonna use forEach loop
         */

        arr.forEach(i -> System.out.println(i));
    }
}
