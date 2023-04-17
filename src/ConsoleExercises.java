import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ConsoleExercises {

    public static void main(String[] args) {

//******** EXERCISES ********
//        1.
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %s. %n", pi);

//        Explore the Scanner Class.
//        1.

        Scanner scn = new Scanner(System.in);
//        System.out.println("Please enter a number:");
//        int userInput = scn.nextInt();
//
//        System.out.println("The number you entered is: " + userInput);

//        2.
//        System.out.println("Please enter three words:");
//
////         .nextLine() WILL COLLECT ALL INPUTS ON THE SAME LINE AND COUNT IT AS ONE SINGLE INPUT
////        String word1 = scn.nextLine();
////        String word2 = scn.nextLine();
////        String word3 = scn.nextLine();
//
////        .next() WILL COLLECT ALL INPUTS ON THE SAME LINE AND COUNT THEM INDIVIAULLY WHEN SEPARATED BY WHITESPACE.
//        String word1 = scn.next();
//        String word2 = scn.next();
//        String word3 = scn.next();
//
//        System.out.printf("you entered: %s, %s, %s.", word1, word2, word3);

//        3.
//        System.out.println("Please enter a sentence: ");
//        String userSentence = scn.next();
//        System.out.println("You entered: " + userSentence);

//        4.
//        System.out.println("Please enter a sentence: ");
//        String userSentence = scn.nextLine();
//        System.out.println("You entered: " + userSentence);

//        Calculate the perimeter and area of Codeup's classrooms.
//        1.
        System.out.println("Please enter the length and width of your classroom: ");
        System.out.println("Enter the length:");
        String userLength = scn.nextLine();
        System.out.println("Enter the width:");
        String userWidth = scn.nextLine();

//        2.

        int perimeter = (parseInt(userLength) * 2) + (parseInt(userWidth) * 2);

        int area = parseInt(userLength) * parseInt(userWidth);

//        Perimeter
        System.out.println("The area of your room is: " + area);
//        Area
        System.out.println("The perimeter of your room is: " + perimeter);

    }

}
