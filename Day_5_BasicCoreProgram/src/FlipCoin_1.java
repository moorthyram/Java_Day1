public class FlipCoin_1 {
    public static void main(String[] args){
        double random = Math.floor(Math.random() * 10) % 5;
        System.out.println(random);
        if(random>2) {
            System.out.println("Heads");
        }
        else {
            System.out.println("Tails");
        }
    }
}
