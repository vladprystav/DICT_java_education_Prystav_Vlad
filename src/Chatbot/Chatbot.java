package Chatbot;

import java.util.Scanner;

public class Chatbot {
    public static void main (String [] args){
        //part 1
        String bot_name = "Tommy";
        int birth_year = 2021;
        System.out.println("Hello! My name is " + bot_name + ".\n" + "I was created in " + birth_year + ".");
        //part 2
        System.out.println("Please, remind me your name.");
        Scanner scanner = new Scanner(System.in);
        String  your_name = scanner.nextLine();
        System.out.println("What a great name you have, " + your_name + "!");
    }
}
