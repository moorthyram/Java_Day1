import java.util.Scanner;

public class Harmonic_4 {
    public static void main(String[] args) {
        int num, i = 1;
        double rr = 0.0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number for length of series");
        num = scan.nextInt();
        while (i<=num){
            System.out.println("1/"+i+"+");
            rr = rr + (double)1/i;
            i++;
        }
        System.out.println("\n\nSum of Harmonic Series is " +rr);


    }
}
