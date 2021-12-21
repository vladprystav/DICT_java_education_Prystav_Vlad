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
        //part 3
        System.out.println("Let me guess your age.\\nEnter remainders of dividing your age by 3, 5 and 7.");
        int remainder3 = scanner.nextInt();
        int remainder5 = scanner.nextInt();
        int remainder7 = scanner.nextInt();
        int your_age = (remainder3*70+remainder5*21+remainder7*15)%105;
        System.out.println("Your age is \"+ your_age+\" ; s a good time to start programming!");
    }
}
