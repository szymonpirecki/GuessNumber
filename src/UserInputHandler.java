import java.util.Scanner;

public class UserInputHandler {

    private static final Scanner sc = new Scanner(System.in);

    public static int getGuess() {
        System.out.println("Give me your guess");
        while (true) {
            try {
                int userGuess = sc.nextInt();

                if (userGuess >= 0 && userGuess < NumberGuessingMachine.BOUND) {
                    return userGuess;
                } else {
                    System.out.println("It has to be a number between 0 and " + (NumberGuessingMachine.BOUND - 1));
                }
            } catch (java.util.InputMismatchException e) {
                sc.next();
                System.out.println("That's not a number. Try again.");
            }
        }
    }
}
