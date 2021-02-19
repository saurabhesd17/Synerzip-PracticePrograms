import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class demo1foreach{
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        /**
         * Now We will show how to iterate list using external interations
         * 1. using for loop by normal way
         * 2. using iterator
         * 3. using enhanced for loop
         */

         for(int i=0; i<10; i++){
             System.out.println(arr.get(i));
         }

         Iterator<Integer> itr = arr.iterator();
         while(itr.hasNext()){
             System.out.println(itr.next());
         }

         for(int i : arr){
             System.out.println(i);
         }
    }
}