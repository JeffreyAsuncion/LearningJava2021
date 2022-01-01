import java.util.Scanner;

public class FortuneTeller101 {
    public static void main(String[] args) {
        System.out.println("Pick a number between 1 and 10");
        Scanner scanner = new Scanner(System.in);

        int inputtedNum = scanner.nextInt();

        if (inputtedNum < 5 ) {
            // this is a comment
            System.out.println("Enjoy the good luck a friend brings you.");
        } else {
            System.out.println("Your Shoe selection will make you happy today.");
        }
    }
}
