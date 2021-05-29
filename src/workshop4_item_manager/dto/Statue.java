package workshop4_item_manager.dto;

import java.util.Scanner;

public class Statue extends Item {
    private int weight;
    private String colour;

    public Statue() {

    }

    public Statue(int value, String creator, int weight, String colour) {
        super(value, creator);
        this.weight = weight;
        this.colour = colour;
    }

    // getter and setter
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getWeight() {
        return weight;
    }

    public String getColour() {
        return colour;
    }

    // method
    public void inputStatue() {
        Scanner sc = new Scanner(System.in);
        super.input();
        while (true) {
            try {
                System.out.print("Enter the weight = ");
                weight = Integer.parseInt(sc.nextLine());
                System.out.print("Enter the colour: ");
                colour = sc.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Error! Enter again! ");
            }
        }
    }

    public void outputStatue() {
        super.output();
        System.out.println("The height: " + getWeight());
        System.out.println("The material: " + getColour());
    }
}