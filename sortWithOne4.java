import java.util.*;

public class sortWithOne4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // int arr[] = {23,67,98,2,45,102,69,53,79,11};
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int k, max=0, index=0, iteration=0;
        int length = arr.length;
        System.out.println("Enter the number of highest element:");
        k = in.nextInt();
        in.close();

        long start = System.nanoTime();

        for(int i=0; i<length-1; i++)
        {
            iteration++;
            
            if(arr[i] > arr[index])
            {
                max++;
            }

            if(i == length-2)
            {
                if(max==(k-1))
                {
                    System.out.println("The highest element is "+ arr[index]);
                    break;
                }
                else
                {
                    i = -1;
                    max = 0;
                    index++;
                }
            }
        }
        long end = System.nanoTime();
        long execution = (end - start);
        System.out.println("Execution time: " + execution + " nanoseconds");
        System.out.println("\nIteration "+iteration);
    }
}
