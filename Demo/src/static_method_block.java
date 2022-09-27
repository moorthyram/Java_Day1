//1.6 Write a program to demonstrate static variables, methods, and blocks.

public class static_method_block {
        static int a = 3;
        static int b;

        static void func(int x) {
            System.out.println("x = " + x);
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }

        static {
            System.out.println("Static block initialized.");
            b = a * 4;
        }

        public static void main(String args[]) {
            func(20);
        }
}
