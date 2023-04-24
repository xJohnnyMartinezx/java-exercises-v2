package util;

import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        Input user1 = new Input();

        System.out.println(user1.getString());
        System.out.println(user1.yesNo());
        System.out.println(user1.getInt());
        System.out.println(user1.getInt(1,10));
        System.out.println(user1.getDouble());
        System.out.println(user1.getDouble(1,10));

    }

//    PROPERTIES
    private final Scanner scanner;


    public Input (Scanner scanner){
        this.scanner = scanner;
    }

    public Input(){
        scanner = new Scanner(System.in);
    }

////    METHODS
    String getString(){
        System.out.println("Enter a string: ");
        return this.scanner.nextLine();
    }
    boolean yesNo(){
        System.out.println("Enter yes or no: ");
        String userInput = scanner.nextLine();
        return userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("y");
    }
    int getInt(int min, int max){
        System.out.println("Enter a number between " + min + " and " + max);
        int userInput =  scanner.nextInt();
        if (userInput < min || userInput > max){
            return getInt(min, max);
            }else {
            return userInput;
        }
    }
    int getInt(){
        System.out.println("Enter a number:");
        int userInput = scanner.nextInt();
        return userInput;
    }
    double getDouble(double min, double max) {
        System.out.println("Enter a decimal number between " + min + " and " + max);
        double userInput = scanner.nextDouble();
        if (userInput < min || userInput > max) {
            return getDouble(min, max);
        } else {
            return userInput;
        }
    }

    double getDouble(){
        System.out.println("Enter a decimal number:");
        return scanner.nextDouble();
    }

}
