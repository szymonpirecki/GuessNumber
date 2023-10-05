public class GuessChecker {
    public static boolean checkIfWin(int guess, int winningNumber) {
        return (winningNumber == guess);
    }

    public static void compareGuessToTarget(int guess, int winningNumber) {
        if (winningNumber > guess) {
            System.out.println("Your number is LOWER than the one you are trying to guess");
        } else {
            System.out.println("Your number is GREATER than the one you are trying to guess");
        }
    }
}
