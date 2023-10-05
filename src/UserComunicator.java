import java.util.Scanner;

public class UserComunicator {
    private static Scanner sc = new Scanner(System.in);

    public static void explainRules() {
        System.out.println("Hello fella\nLets get ready for gumble");
        System.out.println("You have " + NumberGuessingMachine.ATTEMPTS + " tries to guess a number between 0 and " +
                (NumberGuessingMachine.BOUND - 1) + ".\n" +
                "After each guess, the machine tells you if your number is too high or too low.");
    }

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


    public static void displayLoosingMessage(int winningNumber) {
        System.out.println("Sorry you didn't guess the number, the answer was: " + winningNumber);
        sc.close();
    }

    public static void displayWinningMessage() {
        System.out.println("You guessed it!");
        sc.close();

    }

    public static void displayLastGuessMessage() {
        System.out.println("Last try, don't waste it");
    }

    public static void displayRemainingGuesses(int remainingGuesses) {
        System.out.println("You have " + remainingGuesses + " more chances");
    }

    public static void displayTryAgainMessage() {
        System.out.println("Try again");
    }
}
