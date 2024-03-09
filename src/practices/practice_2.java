package practices;

import java.util.Random;
import java.util.Scanner;
/* Develop a Java code that can enable the user to play the classic game Rock Paper Scissors against a machine.
The program prompts the user one of those options. Then the machine takes turn and choose an option in a random way.
The program should find out who won the game according to the game rules
*/
public class practice_2 {
    public static void main(String[] args) {
        int sel;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Rock Paper Scissors");
        System.out.println("Press an option");
        System.out.println("Press 1 for Scissors\nPress 2 for Rock\nPress 3 for paper");

        try {
            int aux = 0;
            while (aux == 0) {
                Random random = new Random();
                int randomNumber = random.nextInt(3) + 1; // Ajust the range to 1,2,3
                System.out.println("Press a number: ");
                sel = scanner.nextInt();

                if (sel >= 1 && sel <= 3) {
                    System.out.println("You choosed: " + sel + " the machine choosed: " + randomNumber);

                    if (sel == randomNumber) {
                        System.out.println("Its a Draw!");
                    } else if ((sel == 1 && randomNumber == 3) || (sel == 2 && randomNumber == 1) || (sel == 3 && randomNumber == 2)) {
                        System.out.println("¡Winner!");
                    } else {
                        System.out.println("You lose");
                    }

                    aux = 1; // Quit the cicle after the play ends
                } else {
                    System.out.println("Invalid input, please choose a number between 1-3");
                }
            }
        } catch (Exception e) {
            System.out.println("Damn... What u done?");
        }
    }
}
