import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        EXERCISES
//        1.
//        a. While

//        int i = 5;
//        while (i <= 15){
//            System.out.println(i);
//            i++;
//        }

//        b. Do While

//        int i = 0;
//        do {
//            System.out.println(i);
//            i+=2;
//        } while (i <= 100);


////         SUBTRACT BY 5s
//        int i = 100;
//        do {
//            System.out.println(i);
//            i-=5;
//        } while (i >= -10);

////        NUMBER SQUARED

//       long i = 2;
//        do {
//            System.out.println(i);
//            i*=i;
//        } while (i <= 1000000);


//        //         SUBTRACT BY 5s FOR LOOP
//        for (int i = 100; i >= -10; i-=5){
//            System.out.println(i);
//        }

////        NUMBER SQUARED
//        for (long i = 2; i <= 1000000; i*=i){
//            System.out.println(i);
//        }

//        2. FIZZBUZZ
//        for (int i = 1; i <= 100; i++){
//            if (i % 3 == 0 & i % 5 == 0){
//                System.out.println("FizzBuzz");
//            }else if (i % 5 == 0){
//                System.out.println("Buzz");
//            }else if(i % 3 == 0){
//                System.out.println("Fizz"); ;
//            } else System.out.println(i);
//        }

////      3. Display a table of powers.
        Scanner scn = new Scanner(System.in);

//        boolean keepGoing = true;

//        System.out.println("would you like to continue? Enter Y or N");
//        String userAnswer = scn.nextLine();
//        if (userAnswer.equalsIgnoreCase("n")) {
//            System.out.println("OK, bye");
//        } else {
//
//                System.out.println("What number would you like to go up to?");
//                int userInput = scn.nextInt();
//                System.out.println("Here's your table:");
//                System.out.println("|  Number  |  Squared  |  Cubed  |");
//
//                String leftAlignFormat = "| %-8s |     %-4d  |    %-4d |%n";
//                for (int i = 1; i <= userInput; i++) {
//                    int squared = i * i;
//                    int cubed = i * i * i;
//
//                    System.out.format(leftAlignFormat, i, squared, cubed);
//                }
//        }

//        **** INITIATING keepGoing TO TRUE ()******
        boolean keepGoing = true;

        do {
            System.out.println("What number would you like to go up to?");
            int userInput = scn.nextInt();
            System.out.println("Here's your table:");
            System.out.println("|  Number  |  Squared  |  Cubed  |");

            String leftAlignFormat = "| %-8d |     %-4d  |    %-4d |%n";
            for (int i = 1; i <= userInput; i++) {
                int squared = i * i;
                int cubed = i * i * i;

                System.out.format(leftAlignFormat, i, squared, cubed);
            }
            System.out.println("Would you like to keep going? [ Y or N ]");
            String userAnswer = scn.next();
            if (userAnswer.equalsIgnoreCase("n")){
                keepGoing = false;
                System.out.println("OK, bye");
            } else if (!userAnswer.equalsIgnoreCase("y")){
                System.out.println("Invalid Input!");
            }
        }
        while (keepGoing);

////        4. Convert given number grades into letter grades.
//

//        boolean anotherGrade = true;
//        do {
//            System.out.println("Enter a number grade ranging from 0-100.");
//            int gradeInput = scn.nextInt();
//
//            if (gradeInput >= 88) {
//                System.out.println("A");
//            } else if (gradeInput >= 80) {
//                System.out.println("B");
//            } else if (gradeInput >= 67) {
//                System.out.println("C");
//            } else if (gradeInput >= 60) {
//                System.out.println("D");
//            } else {
//                System.out.println("you failed");
//            }
//
//            System.out.println("would you like to continue (y/n)?");
//            String userResponse = scn.next();
//            if (userResponse.equalsIgnoreCase("n")) {
//                anotherGrade = false;
//            }
//        }while (anotherGrade);
//
    }

}
