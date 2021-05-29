package workshop2;

import java.util.Scanner;

public class part1 {
    public static void main(String[] args) {

        boolean flag= true;
        do{
            try{
                System.out.print("Enter the number (>= 1) =");
                Scanner sc= new Scanner(System.in);
                int number = sc.nextInt();
                if(number<1) throw new Exception();
                System.out.println("The values of number = "+ number);
                flag= false;
            } catch(Exception check){
                System.out.println("The number is invalid.");
                flag = true;

            }
        }while(flag);
    }
}
