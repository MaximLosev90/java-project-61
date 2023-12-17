package hexlet.code.games;
import java.util.Scanner;

public class Even {
    public static void evenGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int i = 1;
        while (i < 4) {
            int randomNumber = (int) (Math.random() * 99 + 1);
            System.out.println("Question: " + randomNumber);
            Scanner answer = new Scanner(System.in);
            System.out.print("Your answer: ");
            String userAnswer = answer.next();
            String correctAnswer;
            if (randomNumber % 2 == 0) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }
            if (randomNumber % 2 == 0 && userAnswer.equalsIgnoreCase("yes")) {
                System.out.println("Correct!");
                i++;
            } else if (randomNumber % 2 != 0 && userAnswer.equalsIgnoreCase("no")) {
                System.out.println("Correct!");
                i++;
            } else {
                System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was "
                        + "'" + correctAnswer + "'.\n" + "Let's try again, " + userName + "!");
                break;
            }
            if (i == 4) {
                System.out.println("Congratulations, " + userName + "!");
            }
        }
    }
}
