import java.util.Arrays;
import java.util.List;

public class exercise1{
    public static void main(String[] args) {
        List<Integer> age = Arrays.asList(21,22,23,56,34,12,18,45,28);

        age.stream().filter(i -> i>=28).forEach(i -> System.out.println(i));
    }
}