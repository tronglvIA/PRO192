package workshop3;

public class Test {
    public static void main(String[] args) {
     // obj car with null constructor.
        Car car1 = new Car();
        car1.pressStartButton();
        car1.pressAcceleratorButton();
        car1.output();
     // obj car with constructor.
        Car car2 = new Car("red",100, true,true);
        car2.pressAcceleratorButton();
        car2.setColour("black");
        System.out.println("Colour of car2: " + car2.getColour());
        car2.output();
    }

}
