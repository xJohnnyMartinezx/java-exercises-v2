package grades;

import java.util.ArrayList;

public class Student {

//    **** PROPERTIES *****
    private String studentName;
    private ArrayList<Integer> grades;

//    ***** CONSTRUCTOR ******
    public Student(String studentName) {
        this.studentName = studentName;
        this.grades = new ArrayList<>();
    }


//    **** METHODS *****
// returns the student's name
    public String getName(){
        return this.studentName;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade){
        grades.add(grade);
    };
    // returns the average of the students grades
    public double getGradeAverage(){
        double sum = 0;
        for(double grade : grades)
            sum += grade;
        System.out.println("Sum of all grades: " + sum);
        return sum/grades.size();
    };

}
