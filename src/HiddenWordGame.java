import java.util.Scanner;

public class HiddenWordGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HiddenWord puzzle = new HiddenWord("HARPS");

        boolean solved = false;
        while (!solved) {
            System.out.println("What is your guess? (5 letters) ");
            String guess = input.nextLine();
            guess = guess.substring(0,5).toUpperCase();

            String hint = puzzle.getHint(guess);

            solved = hint.equals(guess);
            if (solved) {
                System.out.println("You win!");
            } else {
                System.out.println("Hint: " + hint);
            }
        }
    }
}
