package workshop1;


import java.util.Scanner;

public class part1 {
    public static void main(String[] args) {
        int rows;
        int cols;
        int matrix[][];
        Scanner sc = new Scanner(System.in);
// Validation the values input(rows and cols)
        while(true){
            try {
                System.out.print("Enter the rows = ");
                rows= sc.nextInt();
                System.out.print("Enter the cols = ");
                cols= sc.nextInt();
                if(rows > 0 && cols > 0 ) {
                    break;
                }  else System.out.println("\t\tThe data is not correct! Enter again.");
            } catch(Exception check){
                System.out.println("\t\tThe data is not correct! Enter again.");
                sc.next();
            }
        }
// input and validation values of matrix.
        matrix = new int[rows][cols];       // Dedicate the values cols and cols of a matri.
        System.out.println("Enter the matrix");
        for(int i=0; i < rows; i++){
            for(int j=0; j < cols; j++){
                while(true){
                    try{
                        System.out.print("m[" +i+ "][" +j+ "]=");
                        matrix[i][j] = sc.nextInt();
                        break;
                    } catch(Exception check){
                        System.out.println("\t\tThe data is not correct! Enter again.");
                        sc.next();
                    }
                }
            }
        }
// compute the sum and average.
        int sum=0;
        float average;
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                sum += matrix[i][j];
            }
        }
        average = (float) sum/(rows * cols);
        System.out.println("The value of sum = "+sum);
        System.out.println("the value of average = " + average);
    }
}

