import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class GuessMovie {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "Movies.txt";
        File file = new File(fileName);
        Scanner scanFile = new Scanner(file);

        String[] moviesTitle = new String[25];
        for (int i = 0; i < 25; i++) {
            moviesTitle[i] = scanFile.nextLine();
        }

        Random random = new Random();
        int randomNumber = random.nextInt(24);

        String randomTitle = moviesTitle[randomNumber];
        System.out.println("losowy film: " + randomTitle);
        System.out.println("Podaj tytuł filmu:");
        Scanner scanUser = new Scanner(System.in);
        String takeUserInput = scanUser.nextLine();


        boolean equals = false;

        do {
            if(takeUserInput.equals(randomTitle)){
                System.out.println("Gratulacje, wygrałeś !");
                equals = true;
                break;
            }else {
                System.out.println("Podaj literę: ");
                takeUserInput = scanUser.nextLine();
                char userInputChar = takeUserInput.charAt(0);

                StringBuilder builder = new StringBuilder();
                for (int i = 0; i < randomTitle.length(); i++) {
                    if (randomTitle.charAt(i) == userInputChar) {
                        builder.append(userInputChar);
                    } else if (randomTitle.charAt(i) == ' ') {
                        builder.append(' ');
                    } else {
                        builder.append('_');
                    }
                }
                String hiddenTitle = builder.toString();
                System.out.println("Niepełny tytuł: " + hiddenTitle);

                System.out.println("Podaj tytuł: ");
                takeUserInput = scanUser.nextLine();
            }

        }while (equals == true);



    }
}