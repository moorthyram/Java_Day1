import java.util.Arrays;

public class SecondLargestNumberArray {
    public static void main(String[] args) {

        //Initialize array
        int [] arr =  {20, 15, 7, 80, 95, 28 };
        // sort the array elements in ascending order
        Arrays.sort(arr);
        // print the result
        System.out.println("Second Largest Element in the Array is : " +arr[arr.length-2]);
    }
}
