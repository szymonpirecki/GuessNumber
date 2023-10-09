public class UserComunicator {
    public static void explainRules() {
        System.out.println("Hello fella\nLets get ready for gumble");
        System.out.println("You have " + NumberGuessingMachine.ATTEMPTS + " tries to guess a number between 0 and " +
                (NumberGuessingMachine.BOUND - 1) + ".\n" +
                "After each guess, the machine tells you if your number is too high or too low.");
    }

    public static void displayLoosingMessage(int winningNumber) {
        System.out.println("Sorry you didn't guess the number, the answer was: " + winningNumber);
    }

    public static void displayWinningMessage() {
        System.out.println("You guessed it!");
    }

    public static void displayRemainingGuesses(int remainingGuesses) {
        if (remainingGuesses == 1) {
            System.out.println("Last try, don't waste it");
        } else {
            System.out.println("You have " + remainingGuesses + " more chances");
        }
        System.out.println("Try again");
    }

    public static void displayHint(int guess, int winningNumber ){
        String hint = (guess > winningNumber) ? "GREATER" : "LOWER";
        System.out.println("Your number is "+hint+" than the one you are trying to guess");
    }
}
