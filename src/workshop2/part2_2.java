package workshop2;

import java.util.Scanner;

public class part2_2 {
    public String inputString() throws Exception
    {
        String pattern = "SE+[0-9]{3}";
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        s = sc.nextLine();
        if (!s.matches(pattern)){
            throw new Exception();
        }
        return s;
    }

    public static void main(String[] args) {
        part2_2 obj = new part2_2();
        boolean flag = true;
        do{
            try{
                String s = obj.inputString();
                System.out.println("The String is: "+ s);
                flag = false;
            }catch(Exception check){
                System.out.println("String is invalid!");
                flag = true;
            }
        } while(flag);
    }
}
