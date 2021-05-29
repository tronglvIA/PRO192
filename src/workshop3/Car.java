package workshop3;

public class Car {
    public String Colour;
    public int EnginePower;
    public boolean Convertible;
    public boolean ParkingBrake;
// Constructor.
    public Car(){
    }

    public Car(String Colour, int EnginePower, boolean Convertible, boolean ParkingBrake) {
        this.Colour = Colour;
        this.EnginePower = EnginePower;
        this.Convertible = Convertible;
        this.ParkingBrake = ParkingBrake;
    }
 // Method.
    public void pressStartButton(){
        System.out.println("You have pressed the start button.");
    }

    public void pressAcceleratorButton(){
        System.out.println("You have pressed the Accelerator button.");
    }


    public void output() {
        System.out.println("Colour: " + Colour +
                "\nEnginePower: " + EnginePower +
                "\nConvertible: " + Convertible +
                "\nParkingBrake: " + ParkingBrake);

    }
 //setters.
    public void setColour(String Colour) {
        this.Colour = Colour;
    }

    public void setEnginePower(int Engine) {
        this.EnginePower = Engine;
    }

    public void setConvertible(boolean Convertible) {
        this.Convertible = Convertible;
    }

    public void setParkingBrake(boolean ParkingBrake) {
        this.ParkingBrake = ParkingBrake;
    }
 //getters.

    public String getColour() {
        return Colour;
    }

    public int getEnginePower() {
        return EnginePower;
    }

    public boolean isConvertible() {
        return Convertible;
    }

    public boolean isParkingBrake() {
        return ParkingBrake;
    }
}
