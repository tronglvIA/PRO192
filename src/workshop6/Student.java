package workshop6;

public class Student {
    public String studentId;
    public String studentName;
    public float mark;

    @Override
    public String toString() {
        return "StudentID: " + studentId +
                "\nStudentName: " + studentName +
                "\nMark: " + mark + "\n";
    }

    public Student(String studentId, String studentName, float mark) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.mark = mark;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }
}
