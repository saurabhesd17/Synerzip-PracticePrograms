import java.util.*;

public class sortWithOne {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int arr[] = {23,67,98,2,45,102,69,53,79,11};
        int k,iteration=0,temp,length = arr.length;
        System.out.println("Enter the number of highest element:");
        k = in.nextInt();
        in.close();

        long start = System.nanoTime();

        for(int i=0; i<length-1; i++)
        {
            if(arr[i] > arr[i+1])
            {
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;

                i = -1;
            }
            iteration++;
        }

        for(int i=0; i<length; i++)
        {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nNo. of iteration it took:" + iteration);
        System.out.println("The output for given number " + k + " is " + arr[length-k]);

        long end = System.nanoTime();
        long execution = (end - start);
        System.out.println("Execution time: " + execution + " nanoseconds");
    }
}
