import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {

//        int add = addition(5,5);
//        System.out.println(subtraction(10, 5));


//        System.out.print("Enter a number between 1 and 10: ");
        getInteger(1, 10);

//        getUserInteger(1,10);
        System.out.println(factorial());

    }
//
////    METHODS EXERCISES
////     1.
////       A.
//    public static int addition(int num1, int num2){
//        System.out.println(num1 + num2);
//        return num1 + num2;
//    }
//
//    public static int subtraction(int num1, int num2){
//        return num1 - num2;
//    }
//
//
//
//// 2. RECURSION
////    public static int getInteger(int min, int max){
////        Scanner scn = new Scanner(System.in);
////        int userInput = scn.nextInt();
////        if (userInput >= min && userInput <= max){
////            System.out.println("Success!");
////            return userInput;
////        }
////            System.out.println("Invalid input. Not within range \n Try again.");
////        return getInteger(min, max);
////    }
//
////    3. Calculate the factorial of a number.
//public static long getUserInteger(long min, long max) {
//    System.out.println("Enter an integer between " + min + " and " + max + ": ");
//    Scanner sc = new Scanner(System.in);
//    long userInteger = sc.nextInt();
//
//    if (userInteger >= min && userInteger <= max) {
//        System.out.println("Perfect! the factorial of " + userInteger + " is:");
//        return getFactorial(userInteger);
//
//    } else {
//        System.out.println("Integer entered is outside of specified range. Try again.");
//        return getUserInteger(min, max);
//    }
//}
//
//    public static long getFactorial(long userInteger) {
//
//        if (userInteger < 2) {
//            return 1;
//        } else {
//            System.out.println(userInteger * getFactorial(userInteger - 1));
//            return userInteger * getFactorial(userInteger - 1);
//        }
//    }
public static int getInteger(int min, int max){
    System.out.print("Enter a number between 1 and 10: ");
    Scanner scanner = new Scanner(System.in);
    int userInput = scanner.nextInt();
    if (userInput >= min && userInput <= max){
        return userInput;
    }
    return getInteger(min, max);

}

    public static long factorial(){
        int userFactorial = getInteger(1,10);
        long startNumber = 1;
        for (int i = 1; i <= userFactorial; i++){
            startNumber *= i;
        }
        boolean choice = userContinue();
        if (choice){
            factorial();
        }
        System.out.print(startNumber);
        return startNumber;
    }

    //check if the user wants to continue
    public static boolean userContinue(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to continue? (enter y or n");
        String answer = scanner.nextLine();
        if (answer.equals("y")){
            return true;
        }
        else{
            return false;
        }
    }






}
