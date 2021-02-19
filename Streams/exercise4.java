import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class exercise4 {
    public static void main(String[] args) {
        List<Integer> runs = Arrays.asList(121,22,24,56,34,112,118,45,28,00,5);

        List<Integer> sorted = runs.stream().sorted().collect(Collectors.toList());

        System.out.println(sorted);

    }
}
