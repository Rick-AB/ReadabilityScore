import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String message = "This text should be understood by ";
        System.out.print("Enter path for the text file: ");
        String filePath = in.nextLine();
        File file = new File(filePath);
        Reader reader = new Reader(file);

        System.out.println("Words: " + (int)reader.getWords());
        System.out.println("Sentences: " + (int) reader.getSentences());
        System.out.println("Characters: " + (int) reader.getCharacters());
        System.out.println("The score is: " + reader.getScore());

        int roundedScore = (int) Math.ceil(reader.getScore());

        if (roundedScore == 1){
            System.out.println(message + "5-6 year olds.");
        }else if (roundedScore == 2){
            System.out.println(message + "6-7 year olds.");
        }else if (roundedScore == 3){
            System.out.println(message + "7-9 year olds.");
        }else if (roundedScore == 4){
            System.out.println(message + "9-10 year olds.");
        }else if (roundedScore == 5){
            System.out.println(message + "10-11 year olds.");
        }else if (roundedScore == 6){
            System.out.println(message + "11-12 year olds.");
        }else if (roundedScore == 7){
            System.out.println(message + "12-13 year olds.");
        }else if (roundedScore == 8){
            System.out.println(message + "13-14 year olds.");
        }else if (roundedScore == 9){
            System.out.println(message + "14-15 year olds.");
        }else if (roundedScore == 10){
            System.out.println(message + "15-16 year olds.");
        }else if (roundedScore == 11){
            System.out.println(message + "16-17 year olds.");
        }else if (roundedScore == 12){
            System.out.println(message + "17-18 year olds.");
        }else if (roundedScore == 13){
            System.out.println(message + "18-24 year olds.");
        }else if (roundedScore == 14){
            System.out.println(message + "24+ year olds.");
        }
    }
}
