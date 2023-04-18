import java.util.Scanner;

public class Bob {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        boolean moreQuestions = true;

        do {
            System.out.println("Ask Bob a question.");
            String userInput = scn.nextLine();

            if (userInput.isEmpty()){
                System.out.println("Fine. Be that way!");
            } else if (userInput.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (userInput.endsWith("?")){
                System.out.println("Sure");
            } else {
                System.out.println("Whatever.");
            }

            System.out.println("Want to as Bob More questions? [ Y or N ]");
            String userContinue = scn.nextLine();
            if (userContinue.equalsIgnoreCase("n")){
                System.out.println("OK, bye!");
                moreQuestions = false;
            }


        } while (moreQuestions);






    }
}
