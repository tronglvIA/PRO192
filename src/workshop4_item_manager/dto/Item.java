package workshop4_item_manager.dto;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class Item {
    protected int value;
    protected String creator;

    public Item(){

    }

    public Item(int value, String creator){
        this.value = value ;
        this.creator = creator;
    }

// getter and setter
    public void setValue(int value) {
        this.value = value;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public int getValue() {
        return value;
    }

    public String getCreator() {
        return creator;
    }

//method
    public void input() {
        Scanner sc = new Scanner(System.in);
        while (true){
            try {
                System.out.print("Enter the value = ");
                value = Integer.parseInt(sc.nextLine());
                System.out.print("Enter the creator: ");
                creator = sc.nextLine();
                if (value>0 && !creator.isEmpty()){
                    break;
                } else System.out.println("Error!");
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Enter again!");
            }
        }
    }

    public void output(){
        System.out.println("The value = " + getValue());
        System.out.println("The creator: " + getCreator());
    }

}
