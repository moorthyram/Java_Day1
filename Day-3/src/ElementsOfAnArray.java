public class ElementsOfAnArray {
    // Main driver method
    public static void main(String[] args)
    {

        // Initialize array of random numbers and size
        // Suppose array named 'arr' contains 9 elements
        int[] arr = { 1, 3, 55, 80, 100 };

        System.out.print("Elements of given array are: ");

        // Looping through array by incrementing value of i
        //'i' is an index of array 'arr'
        for (int i = 0; i < arr.length; i++) {

            // Print array element present at index i
            System.out.print(arr[i] + " ");
        }
    }
}
