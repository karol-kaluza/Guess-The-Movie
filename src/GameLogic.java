import java.util.Arrays;
import java.util.regex.Pattern;

public class GameLogic {

    private String hiddenTitle = "";

    public String hideTitle(String movieTitle) {
        String hiddenTitle = movieTitle.replaceAll("\\S", "_ ");
        return hiddenTitle;
    }

    public boolean titleContainLetter(char userLetter, String movieTitle) {
        boolean checkTitleContainLetter = false;
        char[] lettersInMovieTitle = movieTitle.toCharArray();  // get char's from movieTitle
        for (int i = 0; i < lettersInMovieTitle.length; i++) {   // check every char in String movieTitle
            if (lettersInMovieTitle[i] == userLetter) {
                checkTitleContainLetter = true;
            }
        }
        return checkTitleContainLetter;
    }

    public void addLetterToHiddenTitle(char userTryChar, String movieTitle, String hidden) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < movieTitle.length(); i++) {
            if (movieTitle.charAt(i) == userTryChar) {
                builder.append(userTryChar);
            } else if (hidden.charAt(i) == '_'){
                builder.append('_');
            } else if (hidden.charAt(i) != '_'){
                builder.append(hidden.charAt(i));
            }
        }
        hiddenTitle = builder.toString();
        System.out.println(hiddenTitle);
    }

    public boolean compareUserTitle(String userTitle, String randomTitle) {
        boolean isCorrect = false;
        if (userTitle.equals(randomTitle)){
            isCorrect = true;
        }
        return isCorrect;
    }
}
//        char [] movieTitleCharArray = movieTitle.toCharArray();
//        for (int i = 0; i < movieTitleCharArray.length ; i++) {
//            if (movieTitleCharArray[i] == userTryChar){
//                movieTitleCharArray[i] = userTryChar;
//            }else {
//                movieTitleCharArray [i] = '_';
//            }
//        }
//        String hiddenTitleEdit = Arrays.toString(movieTitleCharArray);
//        System.out.println(hiddenTitleEdit);
