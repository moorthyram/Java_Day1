
public class UC_1 {
    public static void main(String[] arg0s){
        double random = Math.floor(Math.random() * 10) % 5;
        System.out.println(random);
        if(random>2) {
            System.out.println("Employee is present");
        }
        else {
            System.out.println("Employee is absent");
        }
    }
}
