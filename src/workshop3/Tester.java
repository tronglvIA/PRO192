package workshop3;

public class Tester {
    public static void main(String[] args) {
        Guitar g1 = new Guitar();
        Guitar g2 = new Guitar("G222",2000,"Sony","Model222","hardWood","softWood");
        System.out.println("State of g1: ");
        g1.createSound();
        System.out.println("State of g2: ");
        g2.createSound();

        System.out.println("set price = 3000 of g1.");
        g1.setPrice(3000);
        System.out.println("Get price of g1: " + g1.getPrice());



    }
}
