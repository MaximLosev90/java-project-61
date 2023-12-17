package hexlet.code.games;
import java.util.Scanner;

public class Calc {
    public static void calcGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("What is the result of the expression?");
        int i = 1;
        while (i < 4) {
            char[] randomArray = {'*', '+', '-'};
            int randomInd = (int) (Math.random() * randomArray.length);
            char randomSym = randomArray[randomInd];
            int correctAnswer;
            int firstNum = (int) (Math.random() * 99 + 1);
            int secondNum = (int) (Math.random() * 99 + 1);
            if (randomSym == '*') {
                correctAnswer = firstNum * secondNum;
            } else if (randomSym == '+') {
                correctAnswer = firstNum + secondNum;
            } else {
                correctAnswer = firstNum - secondNum;
            }
            System.out.println("Question: " + firstNum + randomSym + secondNum);
            Scanner answer = new Scanner(System.in);
            System.out.print("Your answer: ");
            int userAnswer = answer.nextInt();
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
