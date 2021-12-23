package CoffeeMachine;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main (String[]args) {
        Scanner in = new Scanner(System.in);
        int cups;
        int water;
        int milk;
        int coffee_beans;
        System.out.println("Write how many cups of coffee you will need: ") ;
                cups= in.nextInt();
                water=cups*200;
                milk=cups*50;
                coffee_beans=cups*15;
                System.out.println("For"+cups+"cups of coffee you will need");
                System.out.println(water + "ml of Water");
                System.out.println(milk + "ml of Milk");
                System.out.println(coffee_beans + "g of coffee beans");
    }
}
