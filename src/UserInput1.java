import java.util.Scanner;

public class UserInput1 {

    public static void main(String[] args) {
        Scanner nyScanner = new Scanner(System.in);
        System.out.println("type the secret word");
        String secretWord = nyScanner.next();


        System.out.println("Now let's try to guess!");

        String guess = null;
        int tryCount = 0;

        while (!(secretWord.equals(guess))) {
            System.out.println("Try to guess:");
            guess = nyScanner.next();
            tryCount++;
            if (tryCount==3) {
                break;
            }

        }

        if (secretWord.equals(guess)) {
            System.out.println("You won!");
        } else {
            System.out.println("You failed!");
        }
    }
}
