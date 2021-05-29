package workshop4_item_manager.dto;

import java.util.Scanner;

public class Vase extends Item{
    private int height;
    private String material;

    public Vase(){

    }

    public Vase(int value, String creator, int height, String material) {
        super(value, creator);
        this.height = height;
        this.material = material;
    }

    //getter and setter

    public void setHeight(int height) {
        this.height = height;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getHeight() {
        return height;
    }

    public String getMaterial() {
        return material;
    }

//method
    public void inputVase(){
        Scanner sc = new Scanner(System.in);
        super.input();
        while (true){
            try {
                System.out.print("Enter the height = ");
                height = Integer.parseInt(sc.nextLine());
                System.out.print("Enter the material: ");
                material = sc.nextLine();
                break;
            } catch (Exception e){
                e.printStackTrace();
                System.out.println("Enter again!");
            }
        }
    }

    public void outputVase(){
        super.output();
        System.out.println("The height: "+ getHeight());
        System.out.println("The material: "+ getMaterial());
    }

}
