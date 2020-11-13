import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "Movies.txt";
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);

        int lines = 0;
        while (scanner.hasNextLine()){
            String title = scanner.nextLine();
            System.out.println(title);
            lines++;
        }
        System.out.println("Liczba tytułów w pliku: " + lines);
    }
}
