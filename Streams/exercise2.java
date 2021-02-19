import java.util.Arrays;
import java.util.List;

public class exercise2 {
    public static void main(String[] args) {
        List<Integer> runs = Arrays.asList(21,22,23,56,34,12,18,45,28);

        int max = runs.stream().max((m1,m2) -> m1 > m2? 1:-1).get();

        System.out.println(max);
    }
}
