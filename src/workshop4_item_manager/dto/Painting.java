package workshop4_item_manager.dto;

import java.util.Scanner;

public class Painting extends Item{
    private int height;
    private int width;
    private boolean isWatercolour;
    private boolean isFreamed;

    public Painting() {
    }

    public Painting(int value, String creator, int height, int width, boolean isWatercolour, boolean isFreamed) {
        super(value, creator);
        this.height = height;
        this.width = width;
        this.isFreamed = isFreamed;
        this.isWatercolour = isWatercolour;
    }
//method
    public void inputPainting(){
        Scanner sc = new Scanner(System.in);
        super.input();
        while(true){
            try{
                System.out.print("Enter the height = ");
                height = Integer.parseInt(sc.nextLine());
                System.out.print("Enter the width =");
                width = Integer.parseInt(sc.nextLine());
                System.out.print("isWatercolour (true/false):");
                isWatercolour = sc.nextBoolean();
                System.out.print("isFramed (true/false):");
                isFreamed = sc.nextBoolean();
                break;
            } catch (Exception e){
                e.printStackTrace();
                System.out.println("Error! Enter again!");
            }
        }
    }

    public void outputPainting() {
        System.out.println("Value: " + value +
                "\nCreator: " + creator +
                "\nHeight: " + height +
                "\nWidth: " + width +
                "\nWatercolour: " + isWatercolour +
                "\nFreamed: " + isFreamed);
    }
}
