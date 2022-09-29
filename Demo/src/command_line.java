//1.5 To get the name using the command line:

import java.util.Scanner;

public class command_line {

    public static void main(String[] args)
    {
        // Printing the first argument
        System.out.println("Ram");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("your name is: " +name);

    }
}
