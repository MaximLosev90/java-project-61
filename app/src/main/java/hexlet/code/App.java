package hexlet.code;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.print("Please enter the game number and press Enter."
                + "\n1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n0 - Exit\nYour choice: ");
        Scanner choice = new Scanner(System.in);
        String userChoice = choice.next();
        System.out.println("Welcome to the Brain Games!");
        switch (userChoice) {
            case "1":
                Cli.greeting();
                break;
            case "2":
                Even.evenGame();
                break;
            case "3":
                Calc.calcGame();
                break;
            case "4":
                Gcd.gcdGame();
            default:
                break;
        }
        choice.close();
    }
}
