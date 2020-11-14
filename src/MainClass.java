//import java.io.File;
//import java.io.FileNotFoundException;
//import java.util.Random;
//import java.util.Scanner;
//
//public class MainClass {
//    public static void main(String[] args) {
//        String fileName = "Movies.txt";
//        int numberOfTitles = countFileLines();
//        String[] moviesArray = createArrayFromFile(fileName);
//        String randomTitle = chooseRandomTitle();
//        String hiddenTitle = createHiddenTitle();
//        char userInput = getUserInput();
//    }
//
//
//
//    public MainClass() throws FileNotFoundException {
//    }
//
//    public char getUserInput() {
//        Scanner scanUser = new Scanner(System.in);
//        String userInput = scanUser.nextLine();
//        char userInputChar = userInput.charAt(0);
//        return userInputChar;
//    }
//
//    public String createHiddenTitle() {
//        String hiddenT = "";
//        StringBuilder builder = new StringBuilder();
//        for (int i = 0; i < randomTitle.length(); i++) {
//            if (randomTitle.charAt(i) == userInput){
//                builder.append(userInput);
//            } else if (randomTitle.charAt(i) == ' '){
//                builder.append(' ');
//            } else {
//                builder.append('_');
//            }
//        }
//        return hiddenT;
//    }
//
//    public static int countFileLines() throws FileNotFoundException {
//        int counter = 0;
//        File file = new File(fileName);
//        Scanner scanFile = new Scanner(file);
//        while (scanFile.hasNextLine()) {
//            scanFile.nextLine();
//            counter++;
//        }
//        return counter;
//    }
//
//    public String[] createArrayFromFile(String fileName) throws FileNotFoundException {
//        File file = new File(fileName);
//        Scanner scanFile = new Scanner(file);
//        String[] movieTitles = new String[numberOfTitles];
//        for (int i = 0; i < numberOfTitles; i++) {
//            movieTitles[i] = scanFile.nextLine();
//
//        }
//        return movieTitles;
//    }
//
//    public String chooseRandomTitle() {
//        String currentRandomTitle = "";
//        Random random = new Random();
//        int randomNumber = random.nextInt(numberOfTitles - 1);
//        currentRandomTitle = moviesArray[randomNumber];
//        return currentRandomTitle;
//    }
//}
