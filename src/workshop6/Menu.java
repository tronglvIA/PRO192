package workshop6;

import java.util.Scanner;

public class Menu {
    public void showMenu(){
        int chose;
        StudentManager studentManager = new StudentManager();
        do {
            System.out.println("1. Add new student.");
            System.out.println("2. Search student by StudentID.");
            System.out.println("3. Update name and mark student by StudentID.");
            System.out.println("4. Remove studentID.");
            System.out.println("5. Show all student.");
            System.out.println("0. Exit.");
            chose = getChose();
            switch (chose){
                case 1:
                    studentManager.addStudent();
                    break;
                case 2:
                    studentManager.searchStudentById();
                    break;
                case 3:
                    studentManager.updateStudent();
                    break;
                case 4:
                    studentManager.removeStudent();
                    break;
                case 5:
                    studentManager.showAllStudent();
                    break;
            }
        }while (chose != 0);



    }
    public int getChose(){
        int chose;
        Scanner scanner = new Scanner(System.in);
        do{
            try {
                System.out.print("Enter option: ");
                chose = Integer.parseInt(scanner.nextLine());
                if(chose < 0 || chose > 5){
                    System.out.println("Invalid chose!");
                    continue;
                }
                break;
            }catch (Exception exception){
                System.out.println("Invalid.");
            }
        }while (true);
        return chose;
    }
}
