import java.util.*;

public class arrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();

        for(int i=0; i<5; i++){
            arr.add(i);
        }

        // System.out.println("The elements in ArrayList are: " + arr);
        
        // arr.add(3,69);
        // System.out.println("After adding one element: " + arr);
        
        // int number = arr.get(4);
        // System.out.println("The element in an index 4 is: " + number);

        // int removedNumber = arr.remove(2);
        // System.out.println("After removing element: " + arr);
        // System.out.println("The element we removed is: " + removedNumber);

        // arr.set(0,101);
        // System.out.println("After setting element in 0th position: " + arr);

        // for(int i : arr){
        //     System.out.println(i);
        // }

        //Converting ArrayList to Array
        Integer[] arr2 = new Integer[arr.size()];
        arr.toArray(arr2);
        //Integer[] arr2 = arr.toArray(new Integer[0]);
        for(int i : arr2){
            System.out.println(i);
        }
    }
}
