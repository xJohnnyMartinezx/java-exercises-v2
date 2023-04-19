import java.util.Scanner;

public class Bob {

    public static void main(String[] args) {

//        EXERCISE #2 BOB
        Scanner scn = new Scanner(System.in);
        boolean moreQuestions = true;

        do {
            System.out.println("Ask Bob a question.");
            String userInput = scn.nextLine();

            if (userInput.isEmpty() || userInput.equalsIgnoreCase(" ")){
                System.out.println("Fine. Be that way!");
            } else if (userInput.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (userInput.endsWith("?")){
                System.out.println("Sure");
            } else {
                System.out.println("Whatever.");
            }

                boolean userMoreQuestionsPrompt = true;

                do {
                    System.out.println("Want to as Bob More questions? [ Y or N ]");
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
