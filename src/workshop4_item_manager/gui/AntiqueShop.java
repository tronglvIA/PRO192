package workshop4_item_manager.gui;

import workshop4_item_manager.dto.Item;
import workshop4_item_manager.dto.Painting;
import workshop4_item_manager.dto.Statue;
import workshop4_item_manager.dto.Vase;

import java.util.Scanner;

public class AntiqueShop {
    public static void main(String[] args) {
        Item Item=null;
        int choice=0;
        Scanner sc= new Scanner(System.in);
        do{

            System.out.println("1. Create a Vase:");
            System.out.println("2. Create a Statue:");
            System.out.println("3. Create a Painting:");
            System.out.println("4. Display the Item:");
            System.out.print("Input a choice:");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    Item = new Vase();
                    ((Vase)Item).inputVase();
                    break;
                case 2:
                    Item =new Statue();
                    ((Statue) Item).inputStatue();
                    break;
                case 3:
                    Item =new Painting();
                    ((Painting) Item).inputPainting();
                    break;
                case 4:
                    if(Item!=null){
                        if(Item instanceof Vase)
                            ((Vase) Item).outputVase();
                        else if(Item instanceof Statue)
                            ((Statue) Item).outputStatue();
                        else if(Item instanceof Painting)
                            ((Painting) Item).outputPainting ();
                    }
                    else System.out.println(" you need to create an object");
                    break;
            }
        }while(choice<=4);
    }
}

