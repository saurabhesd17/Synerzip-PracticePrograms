import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class exercise6 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Akshay", "akshay", "Aadesh", "Aakash", "Saurabh");

        List<String> nameA = names.stream().filter(A -> A.startsWith("A")).collect(Collectors.toList());

        System.out.println(nameA);
    }
}
