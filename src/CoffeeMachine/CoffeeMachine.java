package CoffeeMachine;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int cups1, cups2;
        int water1, water2;
        int milk1, milk2;
        int coffee_beans1, coffee_beans2;
        int money, tap2;
        String tap;
        cups2=0;
        water1 = 400;
        milk1 = 540;
        coffee_beans1 = 120;
        cups1 = 9;
        money = 550;
        do {
            System.out.println("The coffee machine has;\n" +
                    water1 + "of water\n" +
                    milk1 + "of milk\n" +
                    coffee_beans1 + "of coffee beans\n" +
                    cups1 + "of disposable cups\n" +
                    money + "of money\n");
            System.out.println("What did you do? buy/fill/remaining/exit");
            tap = in.nextLine();
            if (tap.equals("fill")) {
                System.out.println("Water +:");
                water2 = in.nextInt();
                water1 += water2;
                System.out.println("Milk +:");
                milk2 = in.nextInt();
                milk1 += milk2;
                System.out.println("Coffee beans +:");
                coffee_beans2 = in.nextInt();
                coffee_beans1 += coffee_beans2;
                System.out.println("Cups +:");
                cups2 = in.nextInt();
                cups1 += cups2;
            }
            if (tap.equals("take")) {
                money = 0;
            }
            if (tap.equals("buy")) {
                System.out.println("1 - Espresso, 2 - Latte, 3 - Cappuccino");
                tap2 = in.nextInt();
                if (tap2 == 1) {
                    water1 -= 250;
                    milk1 -= 0;
                    coffee_beans1 -= 16;
                    money += 4;
                    cups1--;
                }
                if (tap2 == 2) {
                    water1 -= 350;
                    milk1 -= 75;
                    coffee_beans1 -= 20;
                    money += 7;
                    cups1--;
                }
                if (tap2 == 3) {
                    water1 -= 200;
                    milk1 -= 100;
                    coffee_beans1 -= 12;
                    money += 6;
                    cups1--;
                }
            }
            if ( tap.equals("remaining")){
                System.out.println("The coffee machine has\n"+
                        water1+"of water\n"+
                        milk1+"of milk\n"+
                        coffee_beans1+"of coffee beans\n"+
                        cups1+"of disposable cups\n"+
                        money+"of money\n");
            }
            if (tap.equals("exit")){
                System.exit( 0);
            }
        } while (true);
    }
}
