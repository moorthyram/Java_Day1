
import  java.util.Scanner;

public class DisplayUnitTenHundred {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, u, t, h;
        System.out.println("Enter number");
        n = sc.nextInt();
        u=n%10;
        t=n%100/10;
        h=n%1000/100;
        System.out.println("unit value" +u);
        System.out.println("ten value" +t);
        System.out.println("hundred value" +h);
    }
}
