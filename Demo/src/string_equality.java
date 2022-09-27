//1.3 Write a program to check two strings are equal or not.

public class string_equality {
    public static void main(String[] args) {
        String myStr1 = "Hello";
        String myStr2 = "Hello";
        String myStr3 = "Hello Ram";
        if(myStr1.equals(myStr2)){
            System.out.println("myStr1 and myStr2 is equal");
        }else{
            System.out.println("myStr1 and myStr2 is not equal");
        }
        System.out.println(myStr1.equals(myStr3));
    }
}

