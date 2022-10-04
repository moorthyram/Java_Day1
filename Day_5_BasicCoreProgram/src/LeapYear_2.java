import java.util.Scanner;

public class LeapYear_2 {
    public static void main(String[] args) {

        // year to be checked
        int year;
        System.out.println("Enter the Year : ");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        if(year >= 1584){
            if(((year % 4 == 0) && (year % 100 == 0)) || (year % 400 == 0)){
                System.out.println(year+ " - is a leap year");
            }else{
                System.out.println(year+ " - is not a leap year");
            }
        }else{
            System.out.println("Enter the year above 1584");
        }

    }
}
