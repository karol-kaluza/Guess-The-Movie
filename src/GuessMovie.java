import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class GuessMovie {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "Movies.txt";
        File file = new File(fileName);
        Scanner scanFile = new Scanner(file);
        int attemptCounter = 0;

        String[] moviesTitle = new String[25];
        for (int i = 0; i < 25; i++) {
            moviesTitle[i] = scanFile.nextLine();
        }

        Random random = new Random();
        int randomNumber = random.nextInt(24);

        String randomTitle = moviesTitle[randomNumber];
        System.out.println("Guess the movie title:");
        attemptCounter++;
        Scanner scanUser = new Scanner(System.in);
        String takeUserInput = scanUser.nextLine();
        String hiddenTitle = randomTitle.replaceAll("\\S","_");


        boolean equals = false;

        while (!equals) {
            if (takeUserInput.equals(randomTitle)) {
                System.out.println("Congratulation, correct title is: \"" +
                        randomTitle + "\". You win in yours " + attemptCounter + " attempt !");
                equals = true;
                break;
            } else {
                System.out.println("Unfortunetly is another title, guess a letter: ");
                takeUserInput = scanUser.nextLine();
                char userInputChar = takeUserInput.charAt(0);

                StringBuilder builder = new StringBuilder();
                for (int i = 0; i < randomTitle.length(); i++) {
                    if (randomTitle.charAt(i) == userInputChar) {
                        builder.append(userInputChar);
                    } else if (randomTitle.charAt(i) == ' ') {
                        builder.append(' ');
                    } else if (hiddenTitle.charAt(i) != '_') {
                        builder.append(hiddenTitle.charAt(i));
                    } else {
                        builder.append('_');
                    }
                }
                hiddenTitle = builder.toString();
                System.out.println("Hidden title: " + hiddenTitle);

                attemptCounter++;
                System.out.println(" ");
                System.out.println("It's your " + attemptCounter + " attempt. Try guess movie title: ");
                takeUserInput = scanUser.nextLine();
            }

        }


    }
}