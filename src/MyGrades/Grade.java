package MyGrades;
enum Grade {
    GRADE(02),GRADE2(4),GRADE3(7),GRADE4(10),GRADE5(12),;

    //instance variable
    public int marks;

    // Constructor to initialize the instance variable
    Grade(int marks){
        this.marks=marks;
    }

    // getter
    public int getMarks(){
        return marks;
    }

    // getter
    public static void getMarks(int model){
        Grade marks[]=Grade.values();
        System.out.println("The student grade is:   "+marks[model]+"Is"+marks[model].marks);
    }
    public static class Sample{
        public static void main(Grade args){
            Grade m[]=Grade.values();
            for(int i=0;i<m.length;i++){
                Grade.getMarks(i);
            }
        }
    }
}