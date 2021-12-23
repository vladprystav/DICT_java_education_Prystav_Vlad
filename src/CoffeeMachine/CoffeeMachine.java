package CoffeeMachine;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main (String[]args) {
        Scanner in = new Scanner(System.in);
        int cups1, cups2;
        int water1, water2;
        int milk1, milk2;
        int coffee_beans1, coffee_beans2;
        cups2=0;
        System.out.println("Water has:");
        water1 = in.nextInt();
        System.out.println("Milk has:");
        milk1 = in.nextInt();
        System.out.println("Coffee beans has:");
        coffee_beans1 = in.nextInt();
        System.out.println("cups need;");
        cups1 = in.nextInt();
        water2 = water1 / 200;
        milk2 = milk1 / 50;
        coffee_beans2 = coffee_beans1 / 15;
        if (water2<milk2) {
            if (water2<coffee_beans2) {
                cups2 = water2;
            }
            else if (coffee_beans2 < water2) {
                cups2 = coffee_beans2;
            }
        }
        else if (milk2 < coffee_beans2) {
            cups2 = milk2;
        } else {
            cups2 = coffee_beans2;
        }

        if (cups2 < cups1) {
            cups2 = cups2 - cups1;
            System.out.println("I can make this cups, and" + cups2 + "more");
        } else if (cups2 == cups1) {
            System.out.println("Yes, i can make this cups");
        } else {
            System.out.println("Sorry, i can make only" + cups2 + "cups");
        }
    }
}
