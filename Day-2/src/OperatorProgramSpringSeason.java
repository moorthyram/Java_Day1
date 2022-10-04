
import java.util.Scanner;

public class OperatorProgramSpringSeason {
    public static void main(String[] args) {
        System.out.println("Enter Month and Day: ");
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int m = sc1.nextInt();
        int d = sc2.nextInt();
        boolean isSpring =  (m == 3 && d >= 20 && d <= 31)
                || (m == 4 && d >=  1 && d <= 30)
                || (m == 5 && d >=  1 && d <= 31)
                || (m == 6 && d >=  1 && d <= 20);

        System.out.println("Spring Season is : " +isSpring);
    }

}
