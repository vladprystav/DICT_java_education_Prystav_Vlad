package Hangman;
import  java.util.Scanner;

import static java.lang.Math.random;

public class hangman {
    public static void main (String[] arg){
        System.out.println("The game will be available soon");
        String word;
        String correct_word;
        correct_word = "java";
        Scanner in = new Scanner(System.in);
        int min;
        int max;
        min=1;
        max=4;
        int cloose_word = min +(int)(random()*(max-min+1));
        if (cloose_word==1){
            correct_word = "python";
        }
        else if (cloose_word == 2){
            correct_word = "java";
        }
        else if (cloose_word == 3){
            correct_word = "javascript";
        }
        else if (cloose_word == 4){
            correct_word = "kotlin";
        }
        word = in.nextLine();

        if (correct_word.equals(word)){
            System.out.println("YOU SURVIED");
        }
        else {
            System.out.println("YOU LOST");
        }
    }
}
