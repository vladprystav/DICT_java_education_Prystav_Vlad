package Hangman;
import  java.util.Scanner;
import static java.lang.Math.random;
public class hangman {
    public static void main (String[] arg){
        System.out.println("The game will be available soon");
        char letter;
        String correct_word;
        correct_word = "java";
        Scanner in = new Scanner(System.in);
        int min;
        int max;
        int letters;
        int num = 1;
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
        letters = correct_word.length();
        char[] word = new char[letters];
        char[] use_letters =new char[50];
        int cycle;
        int numb = 0;
        int numb_for_letter = 0;
        cycle = 0;
        for (int i = 0; i < correct_word.length(); i++) {
            word[i] = '-';
        }
        for (int i = 0; i < 8; i++) {
            System.out.println("Enter letter:");
            letter = in.next().charAt(0);
            for (int o = 0; o < letters; o++){
                if (letter == correct_word.charAt(o)) {
                    word[o] = letter;
                    numb_for_letter = 1;
                }
            }
            System.out.println(word);
            for (int l = 0; l < 50; l++) {
                if (letter == use_letters[l]) {
                    numb++;
                }
            }
            if (numb > 0) {
                System.out.println("No improvements");
            }
            else if (numb_for_letter == 1) {
                i--;
            }
            else {
                System.out.println("That letter doesn't apper in the word");
            }

            for (int p = 0; p< letters; p++){
                if (word[p] == correct_word.charAt(p)){
                    num++;
                }
            }
            if (num == letters) {
                System.out.println("YOU SURVIVED");
                System.exit(0);
            }
            else {
                num = 0;
            }
            use_letters[cycle] = letter;
            cycle++;
            numb = 0;
            numb_for_letter = 0;
        }
            System.out.println("YOU LOST");
        }
    }

