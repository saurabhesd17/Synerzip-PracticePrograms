import java.util.Arrays;
import java.util.List;

public class exercise5 {
    public static void main(String[] args) {
        List<Integer> runs = Arrays.asList(8,12,02,06,10,11,00,18,30,05,10);
        float overs = 10.0f;
        float totalRuns = runs.stream().reduce((c,e) -> c+e).get();
        float runRate = totalRuns/overs;

        System.out.println(totalRuns);
        System.out.println(runRate);
    }
}
