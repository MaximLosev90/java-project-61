package hexlet.code.games;

import java.util.Scanner;

public class Gcd {
    public static void gcdGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("Find the greatest common divisor of given numbers.");
        int i = 1;
        while (i < 4) {
            int firstNum = (int) (Math.random() * 99 + 1);
            int secondNum = (int) (Math.random() * 99 + 1);
            System.out.println("Question: " + firstNum + " " + secondNum);
            Scanner answer = new Scanner(System.in);
            System.out.print("Your answer: ");
            int userAnswer = answer.nextInt();
            int correctAnswer = 0;
            for (int j = 1; j <= Math.max(firstNum, secondNum); j++) {
                if (firstNum % j == 0 && secondNum % j == 0) {
                    correctAnswer = j;
                }
            }
            if (userAnswer == correctAnswer) {
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
