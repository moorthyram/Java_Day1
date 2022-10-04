//Java program for solving arithmetic operations

import java.util.Scanner;

//Creating the class named as Arithmetic Operation
public class OperatorProgramArithmetic {
    public static void main(String[] args) {
        System.out.println("Enter value of a, b, c: ");

        //Creating three objects for taking three different input from command line
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);

        //Initializing all result variables to 0
        int result1 =0;
        int result2 =0;
        int result3 =0;
        int result4 =0;

        int a = sc1.nextInt();
        int b = sc2.nextInt();
        int c = sc3.nextInt();

        //Doing the arithmetic operation on given expression
        result1 = a + b * c;
        result2 = c + a / b;
        result3 = a % b + c;
        result4 = a * b + c;

        //Printing out the result
        System.out.println("First result is: " + result1);
        System.out.println("Second result is: " + result2);
        System.out.println("Third result is: " + result3);
        System.out.println("Fourth result is: " + result4);


    }
}
