package workshop6;

import java.util.Scanner;

public class Inputter {
    public final Scanner scanner;

    public Inputter() {
        this.scanner = new Scanner(System.in);
    }

    public float inputScore(){
        float score = 0;
        boolean flag;
        do{
            try {
                System.out.print("Input score: ");
                score = Float.parseFloat(scanner.nextLine());
                if(score < 0 || score > 10){
                    System.out.println("Score invalid!");
                    flag = true;
                }else {
                    flag = false;
                }
            }catch (Exception exception){
                System.out.println("Score invalid!");
                flag = true;
            }
        }while(flag);
        return score;
    }


    public String inputStudentId(){
        String studentId, pattern;
        pattern = "S+[0-9]{3}";
        do{
            System.out.print("Enter StudentID: ");
            studentId = scanner.nextLine().trim().toUpperCase();
        }while (!studentId.matches(pattern));
        return studentId;
    }

    public String inputStudentName(){
        String studentName;
        do{
            System.out.print("Enter student name: ");
            studentName = scanner.nextLine().trim();
            if(studentName.isEmpty()){
                System.out.println("Invalid student name, Enter again!");
                continue;
            }
            studentName = studentName.toUpperCase();
            studentName = studentName.charAt(0) + studentName.substring(1).toLowerCase();
            if(studentName.isEmpty() || !studentName.matches("^[a-zA-Z]*$")){
                System.out.println(studentName);
                System.out.println("Invalid! Name only letter character.");
                continue;
            }
            break;
        }while (true);
        return studentName;
    }
}