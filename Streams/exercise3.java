import java.util.Arrays;
import java.util.List;

public class exercise3 {
    public static void main(String[] args) {
        List<Integer> age = Arrays.asList(21,22,24,56,34,12,18,45,28);

        int average = (age.stream().reduce((c,e) -> c+e).get()) / 10;
        System.out.println("Avereage " + average);
    }
}
