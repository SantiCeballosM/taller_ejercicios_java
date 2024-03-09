package practices;
/*Calculation of greatest common divisor

Develop a java program which prompts the user to enter two positive integer numbers,
then calculate and show his greatest common divisor
*/

import java.util.Scanner;

public class practice_9 {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter the first number: ");
            int num1 = input.nextInt();

            System.out.println("Enter the second number: ");
            int num2 = input.nextInt();

            while (num2 != 0) {
                int temp = num2;
                num2 = num1 % num2;
                num1 = temp;
            }

            System.out.println("The greatest common divisor of " +num1 +" and " + num2 +" is: "+ num1);
        } catch (Exception e) {
            System.out.println("Yo dude whats going on?");
        }
    }
}

