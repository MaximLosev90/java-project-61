package hexlet.code;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.print("Please enter the game number and press Enter."
                + "\n1 - Greet\n2 - Even\n3 - Calc\n0 - Exit\nYour choice: ");
        Scanner choice = new Scanner(System.in);
        String userChoice = choice.next();
        System.out.println("Welcome to the Brain Games!");
        if (userChoice.equals("1")) {
            Cli.greeting();
        } else if (userChoice.equals("2")) {
            Even.evenGame();
        } else if (userChoice.equals("3")) {
            Calc.calcGame();
        }
        choice.close();
    }
}
