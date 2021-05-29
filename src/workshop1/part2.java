package workshop1;

import java.util.Scanner;


public class part2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// dedicate the variable
        float number1, number2;
        char op;

// Validation the input
        while(true){
            try{
                System.out.print("Enter the Number 1 = ");
                number1 = sc.nextFloat();
                System.out.print("Enter the number 2 = ");
                number2 = sc.nextFloat();
                break;
            } catch(Exception check){
                System.out.println("\t\tThe data is not correct! Enter again.");
                sc.next();
            }
        }

        do {
            System.out.print("Enter the operator = ");
            op = sc.next().charAt(0);
            switch(op){
                case '+':
                    System.out.println("The result = " +(number1 + number2));
                    break;
                case '-':
                    System.out.println("The result = " +(number1 - number2));
                    break;
                case '*':
                    System.out.println("The result = " +(number1 * number2));
                    break;
                case '/':
                    if(number2 != 0){
                        System.out.println("The result = " +(number1 / number2));
                    } else System.out.println("OPPS ERROR....DENOMINATOR = 0.");
                    break;
                default:
                    System.out.println("The operator is not Invalid! Enter again.");
            }
        } while(op != '+' && op != '-' && op != '*' && op != '/' );


    }
}
