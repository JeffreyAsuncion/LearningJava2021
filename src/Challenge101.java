import java.util.Scanner;

public class Challenge101 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        boolean loopAgain = true;
        while(loopAgain) {
            String question = "Who are you today Isabella Grace?";
            String choiceOne = "Kitty Fairy";
            String choiceTwo = "Pinky";
            String choiceThree = "Muimui";

            // Write a print statement asking the question
            System.out.println(question);
            // Write a print statement giving the answer choices
            System.out.println("a. " + choiceOne);
            System.out.println("b. " + choiceTwo);
            System.out.println("c. " + choiceThree);

            // Have the user input an answer
            System.out.println("Please Choose a letter : ");

            // Retrieve the user's input
            String userInput = input.next();

            // If the user's input matches the correctAnswer...
            // then the user is correct and we want to print out a congrats message to the user.
            if (userInput.equals("a")) {
                System.out.println("Yes, I am Kitty Fairy!!!");
                loopAgain = false;
            } else {
                System.out.println("Nope, try again!!!!");
            }
        }
        // If the user's input does not match the correctAnswer...
        // then the user is incorrect and we want to print out a message saying that the user is incorrect as well as what the correct choice was.

    }
}
