package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student student1 = new Student("Stewart");
        student1.addGrade(70);
        student1.addGrade(90);
        student1.addGrade(100);

        students.put("littleStewart", student1);

        Student student2 = new Student("Kevin");
        student2.addGrade(56);
        student2.addGrade(80);
        student2.addGrade(95);

        students.put("soKevin", student2);

        Student student3 = new Student("Francis");
        student3.addGrade(78);
        student3.addGrade(96);
        student3.addGrade(85);

        students.put("francisTheGreat", student3);

        Student student4 = new Student("Johnny");
        student4.addGrade(100);
        student4.addGrade(90);
        student4.addGrade(98);

        students.put("johnny5", student4);




        Scanner scn = new Scanner(System.in);
        boolean moreQuestions = true;

        do {
            System.out.println("Welcome!");
            System.out.println("Here is a list of students GitHub usernames:");

            for (String studentUserName : students.keySet()){
                System.out.print("|");
                System.out.print(studentUserName + "|   ");
            }
            System.out.println();
            System.out.println("What student would you like to see more information on?");
            System.out.print("Enter a name: ");
            String userInput = scn.nextLine();

            if (students.containsKey(userInput)){
                System.out.println("Student Name: " + students.get(userInput).getName());
                double gradeAve = students.get(userInput).getGradeAverage();
                System.out.printf("Grade Average is: %.2f \n", gradeAve);
            } else {
                System.out.println("The username you entered does not exists");
            }

            boolean userMoreQuestionsPrompt = true;

            do {
                System.out.println("Would you like to search for another student? [ Y or N ]");
                String userContinue = scn.nextLine();
                if (userContinue.equalsIgnoreCase("n")) {
                    moreQuestions = false;
                    userMoreQuestionsPrompt = false;
                    System.out.println("OK, bye");
                } else if (userContinue.equalsIgnoreCase("y")){
                    userMoreQuestionsPrompt = false;
                } else {
                    System.out.println("Invalid Input!");
                }
            } while (userMoreQuestionsPrompt);
        } while (moreQuestions);


    }
}
