
import java.io.*;

public class ReadNumber {

        static void ToDigits(int n, String[] arr)
        {

            // base case
            if (n == 0) {
                return;
            }

            // storing the last digit of the number and updating
            // number
            int digit = n % 10;
            n = n / 10;

            // recursive call
            ToDigits(n, arr);

            // printing the digits form the string array storing name
            // of the given index
            System.out.print(arr[digit]);
            System.out.print(" ");
        }

        // Driver Code
        public static void main(String args[])
        {
            String[] arr = { "zero", "one", "two",   "three", "four",    "five", "six", "seven", "eight", "nine" };
            int n = 5;  //it can be changed to take user input

            ToDigits(n, arr);
        }
}
