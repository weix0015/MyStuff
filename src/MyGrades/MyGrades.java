package MyGrades;

public class MyGrades {
    public String studentNumber;

    //Getter for student number.
    public String getStudentNumber() {
        studentinformation();
        return studentNumber;
    }

    //Setter for the studentNumber.
    public String setStudentNumber(String newStudentNumber) {
        this.studentNumber = newStudentNumber;
        return studentNumber;
    }

    public String name;

    //Getter for name.
    public String getName() {
        studentinformation();
        return name;
    }

    //setter for the name
    public  String setName(String newName) {
        this.name = newName;
        return name;
    }

    public int grade;

    // getter for the grade
    public  int getGrade() {
        gradeinformation();
        Grade.Sample.main(Grade.GRADE);
        return grade;
    }

    // setter
    public int setGrade( int newgrade) {
        this.grade = newgrade;
        return grade;
    }

    public void gradeinformation() {
    }
    public void studentinformation() {
        setName("Isaac");
        setStudentNumber("1700");
    }
}