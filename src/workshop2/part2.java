package workshop2;

import java.util.Arrays;
import java.util.Scanner;

public class part2 {
    public static void main(String[] args)  {
        Scanner sc= new Scanner(System.in);
        boolean flag= false;
        do{
            try{
                String pattern = "SE+[0-9]{3}";
//                System.out.println(pattern);se
                String name ="";
                System.out.print("Input The String: ");
                name = sc.nextLine();
                if(!name.matches(pattern)){
                    throw new Exception();
                }
                System.out.println(" The string is: " + name);
                flag = false;
            } catch(Exception check){
                System.out.println("The string is invalid. Input again!");
                flag = true;
            }
        } while (flag);
    }
}
