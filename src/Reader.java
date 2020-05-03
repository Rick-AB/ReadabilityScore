import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reader {
    private double words = 0.0;
    private double sentences = 0.0;
    private double characters = 0.0;
    private String text = "";

    //Constructor to open a file containing the text
    Reader(File file){
        StringBuilder builder = new StringBuilder();
        try (Scanner scanner = new Scanner(file)){
            while (scanner.hasNext()){
                builder.append(scanner.nextLine());
            }
            text = builder.toString();
            System.out.println("The text is:\n" + text);
        }catch (FileNotFoundException e){
            System.out.println();
        }
    }
    //Method for calculating number of words in the text
    public double getWords(){
        String textForWords = text.trim();
        String[] arrWords = textForWords.split("\\s+");
        words = arrWords.length;
        return words;
    }
    //Method for calculating number of sentences in the text
    public double getSentences(){
        String regexSent = "[!.?]";
        String[] sentArr = text.split(regexSent);
        sentences = sentArr.length;
        return sentences;
    }
    //Method for calculating number of characters including punctuations(. , ! ?....)
    public double getCharacters() {
        String textForChar = text.replace(" ", "");
        characters = textForChar.length();
        return characters;
    }
    //Method for calculating the score used to determine the age range.
    public double getScore(){
        double score = 4.71 * (characters / words) + 0.5 * (words / sentences) - 21.43;
        return score;
    }
}
