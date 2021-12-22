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
        int choose_word = min +(int)(random()*(max-min+1));
        if (choose_word==1){
            correct_word = "python";
        }
        else if (choose_word == 2){
            correct_word = "java";
        }
        else if (choose_word == 3){
            correct_word = "javascript";
        }
        else if (choose_word == 4){
            correct_word = "kotlin";
        }
        letters = correct_word.length();
        char[] word = new char[letters];
        char[] use_letters =new char[50];
        char[] bad_letters = {'Q','W','E','R','T','Y','U','I','O','P','A','D','F','G','H','J','K','L','Z','X','C','V','B','N','M'};
        int cycle;
        int numb = 0;
        int numb_for_letter = 0;
        boolean cont = true;
        cycle = 0;
        for (int i = 0; i < correct_word.length(); i++) {
            word[i] = '-';
        }
        for (int i = 0; i < 8; i++) {
            do{
                cont = true;
                System.out.println("Enter letter:");
                letter = in.next().charAt(0);
                for (int k=0; k<bad_letters.length; k++){
                    if (letter == bad_letters[k]){
                        cont = false;
                    }
                }
            } while (cont == false);
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
                System.out.println("You've already quessed this letter");
                i --;
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

