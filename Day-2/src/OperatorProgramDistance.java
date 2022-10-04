
import java.util.Scanner;

public class OperatorProgramDistance {
    public static void main(String[] args) {
        System.out.println("Enter x value and y value: ");

        // taking input from command-line
        Scanner obj1 = new Scanner(System.in);
        Scanner obj2 = new Scanner(System.in);

        int x = obj1.nextInt();
        int y = obj2.nextInt();
        System.out.println(x);
        System.out.println(y);

        // compute distance to (0, 0)
        double dist = Math.sqrt(x*x + y*y);

        // output distance
        System.out.println("distance from (" + x + ", " + y + ") to (0, 0) = " + dist);
    }
}