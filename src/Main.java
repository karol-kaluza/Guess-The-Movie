import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        String fileName = "Movies.txt";
        File file = new File(fileName);
        Scanner scanFile = new Scanner(file);

        int guessTitleAttempt = 1;
        int guessLetterAttempt = 0;

        String [] titles = new String [25];
        for (int i = 0; i < 25; i++) {
            titles [i] = scanFile.nextLine();
        }
        Random random = new Random();
        int randomNumber = random.nextInt(24);
        String randomTitle  = titles[randomNumber];
        System.out.println("You are guessing: " + randomTitle);

        GameLogic gameLogic = new GameLogic();
        String hiddenTitle = gameLogic.hideTitle(randomTitle);
        System.out.println("Hidden title: " + hiddenTitle);
        System.out.println("");

        Scanner scanUser = new Scanner(System.in);
        String userTitle = scanUser.nextLine();
        if (gameLogic.compareUserTitle (userTitle, randomTitle)){
            System.out.println("Congratulation, that was your " + guessTitleAttempt + " attempt, you win !");
        } else {
            guessTitleAttempt++;
            System.out.println("Guess letter: ");
            String userChar = scanUser.nextLine();
            char userTryChar = userChar.charAt(0);
            if(!gameLogic.titleContainLetter(userTryChar, randomTitle)){        //user dint't guess letter in title
                guessLetterAttempt++;
                System.out.println("Unfortunately, the title doesn't contain this letter: " + userChar);
            }else if (gameLogic.titleContainLetter(userTryChar, randomTitle)){
                gameLogic.addLetterToHiddenTitle(userTryChar, randomTitle);
            }
        }



    }
}
