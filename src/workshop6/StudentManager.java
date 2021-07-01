package workshop6;

import java.util.ArrayList;

public class StudentManager {
    public ArrayList<Student> listStudent;

    public StudentManager() {
        this.listStudent = new ArrayList<Student>();
    }
    /*the method to check whether a any student existed before
        if exist return value boolean is true
        else if not exist return value is false    */
    public boolean isExistStudentId(String studentId){
        for(Student student: listStudent){  //working array to check whether studentID exist
            if(student.getStudentId().equals(studentId)){   //if studentId found stop loop working the array and return value true
                return true;
            }
        }
        return false;   //studentId not found return value false
    }
    /*The method will be accepted add a new student
        if all attribute of object student input correct
        and must satisfied StudentID is unique     */
    public void addStudent(){
        String studentId, studentName;
        float mark;
        Inputter inputter = new Inputter();
        studentId = inputter.inputStudentId();
        /*  Check whether StudentID unique if method isExistStudentId(studentId) return value true
            that mean studentID has use by another student and notification add student failed  */
        if(isExistStudentId(studentId)){
            System.out.println("StudentID: " + studentId + " has use by another student. Add student!");
        }else {
            //This block code will be execute when studentID is unique
            studentName = inputter.inputStudentName(); //input name following form
            mark = inputter.inputScore(); //input score
            listStudent.add(new Student(studentId, studentName, mark)); //Create a new object student with all attribute was input above and add to list student
            System.out.println("Add student success!");
        }
    }

    public void searchStudentById(){
        String studentId;
        boolean exist = false;
        Inputter inputter = new Inputter();
        studentId = inputter.inputStudentId();
        for (Student student: listStudent){
            if(student.getStudentId().equals(studentId)){
                System.out.println(student.toString());
                exist = true;
                break;
            }
        }
        if(!exist){
            System.out.println("StudentID: " + studentId + " not exist!");
        }
    }

    public void updateStudent(){
        Inputter inputter = new Inputter();
        String studentId;
        boolean modified = false;
        studentId = inputter.inputStudentId();
        for(Student student: listStudent){
            if(student.getStudentId().equals(studentId)){
                String newStudentName = inputter.inputStudentName();
                float newMark = inputter.inputScore();
                student.setStudentName(newStudentName);
                student.setMark(newMark);
                System.out.println("Update success!");
                System.out.println(student.toString());
                modified = true;
                break;
            }
        }
        if (!modified){
            System.out.println("StudentID: " + studentId + " not found. Update failed!");
        }
    }
    public void removeStudent(){
        Inputter inputter = new Inputter();
        String studentId;
        boolean modified = false;

        studentId = inputter.inputStudentId();
        for(int i = 0; i < listStudent.size(); i++){
            if(listStudent.get(i).getStudentId().equals(studentId)){
                System.out.println(listStudent.get(i).toString());
                System.out.println("Remove success!");
                listStudent.remove(i);
                modified = true;
                break;
            }
        }
        if (!modified){
            System.out.println("StudentID: " + studentId + " not found. Remove failed!");
        }
    }

    public void showAllStudent(){
        System.out.println("List student: ");
        for (Student student: listStudent){
            System.out.println(student.toString());
        }
    }
}
