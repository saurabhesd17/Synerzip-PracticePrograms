import java.util.Arrays;
import java.util.List;

public class demo5findfirst {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(11,23,32,4,55,66,78,86,99,100);

        /**
         * as name suggest findFirst reeturns first value
         * however it shows value as an optional to reduce errors
         * to remove optional we need to use orElse where we specify which value to show
         */
        
        System.out.println(
            arr.stream()
            .filter(i -> i%5==0)
            .findFirst());
        
        System.out.println(
            arr.stream()
            .filter(i -> i%5==0)
            .findFirst()
            .orElse(0));
    }
}
