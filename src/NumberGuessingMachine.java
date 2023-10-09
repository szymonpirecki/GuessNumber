import java.util.Random;

public class NumberGuessingMachine {
    public static final int BOUND = 100;
    public static final int ATTEMPTS = 5;

    public static void playTheGame() {
        UserComunicator.explainRules();
        int winningNumber = new Random().nextInt(BOUND);
        int remainingGuesses = ATTEMPTS;

        while (true) {
            int usersGuess = UserInputHandler.getGuess();
            if (ResultChecker.checkIfWin(usersGuess, winningNumber)) {
                UserComunicator.displayWinningMessage();
                break;
            }
            remainingGuesses--;
            if (remainingGuesses == 0) {
                UserComunicator.displayLoosingMessage(winningNumber);
                break;
            }
            UserComunicator.displayHint(usersGuess, winningNumber);
            UserComunicator.displayRemainingGuesses(remainingGuesses);
        }
    }
}





