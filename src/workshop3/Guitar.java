package workshop3;

import java.util.ArrayList;
import java.util.Scanner;

public class Guitar {
    public String serialNumber;
    public float Price;
    public String Builder;
    public String Model;
    public String backWood;
    public String topWood;

 // constructor
    public Guitar(){
    }

    public Guitar(String serialNumber, float Price, String Builder, String Model, String backWood, String topWood) {
        this.serialNumber = serialNumber;
        this.Price = Price;
        this.Builder = Builder;
        this.Model = Model;
        this.backWood = backWood;
        this.topWood = topWood;
    }
 // method
    public void Add(){
        Scanner sc = new Scanner(System.in);
        Guitar g = new Guitar();
        System.out.println("Enter the Information of Guitar: ");
        // input serial number
        System.out.print("Serial Number: ");
        serialNumber = sc.nextLine();
        g.setSerialNumber(serialNumber);
        // input price
        System.out.print("Price: ");
        Price = sc.nextFloat();
        sc.next();
        g.setPrice(Price);
        // input builder
        System.out.print("Builder: ");
        Builder = sc.nextLine();
        g.setBuilder(Builder);
        // input model
        System.out.print("Model: ");
        Model = sc.nextLine();
        g.setModel(Model);
        // input back wood
        System.out.print("Back Wood: ");
        backWood = sc.nextLine();
        g.setBackWood(backWood);
        // in put top wood
        System.out.print("Top Wood: ");
        topWood = sc.nextLine();
        g.setTopWood(topWood);
    }
    public void searchBySerial(ArrayList<Guitar> listGuitar){
        Scanner sc = new Scanner(System.in);
        String serialSearch;
        System.out.println("Enter the serial number: ");
        serialSearch = sc.nextLine();
        for (Guitar guitar: listGuitar){
            if(serialSearch.equals(guitar.getSerialNumber())){
                System.out.println("Ok!");
            }
        }
    }
    public void createSound(){
        System.out.println("Serial Number: "+ getSerialNumber());
        System.out.println("Price: " + getPrice());
        System.out.println("Builder: "+ getBuilder());
        System.out.println("Model: "+ getModel());
        System.out.println("Back Wood: " + getBackWood());
        System.out.println("Top Wood: " + getTopWood());
    }

 // setters

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setPrice(float Price) {
        this.Price = Price;
    }

    public void setBuilder(String Builder) {
        this.Builder = Builder;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public void setBackWood(String backWood) {
        this.backWood = backWood;
    }

    public void setTopWood(String topWood) {
        this.topWood = topWood;
    }

    // getters


    public String getSerialNumber() {
        return serialNumber;
    }

    public float getPrice() {
        return Price;
    }

    public String getBuilder() {
        return Builder;
    }

    public String getModel() {
        return Model;
    }

    public String getBackWood() {
        return backWood;
    }

    public String getTopWood() {
        return topWood;
    }
}
