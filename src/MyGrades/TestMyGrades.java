package MyGrades;

public class TestMyGrades {

    public static void main(String[] args) {
        MyGrades isaac = new MyGrades();
        isaac.studentinformation();
        System.out.println(isaac.getName()+ " " + isaac.getStudentNumber()+ " " + isaac.getGrade());
    }
}