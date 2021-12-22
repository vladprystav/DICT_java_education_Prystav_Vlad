package Hangman;
import  java.util.Scanner;

public class hangman {
    public static void main (String[] arg){
        System.out.println("The game will be available soon");
        String word;
        String correct_word;
        correct_word = "java";
        Scanner in = new Scanner(System.in);
        word = in.nextLine();

        if (correct_word.equals(word)){
            System.out.println("YOU SURVIED");
        }
        else {
            System.out.println("YOU LOST");
        }
    }
}
