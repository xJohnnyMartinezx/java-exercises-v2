package grades;

public class StudentTest {

    public static void main(String[] args) {
        Student student1 = new Student("testStudent");
        student1.addGrade(70);
        student1.addGrade(90);
        student1.addGrade(100);
        student1.addGrade(60);

        System.out.println("Student 1 Garde Average: " + student1.getGradeAverage());

        Student student2 = new Student("testStudent");
        student2.addGrade(50);
        student2.addGrade(60);
        student2.addGrade(75);
        student2.addGrade(80);

        System.out.println("Student 2 Garde Average: " + student2.getGradeAverage());
    }

}
