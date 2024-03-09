package practices;/*Ordering Numbers (without using arrays):

Create a Java program that prompts the user to enter three integers.
Then, display the numbers in ascending order, using conditionals to determine
which is the largest, the intermediate and the smallest.*/
import java.util.Scanner;
public class practice_7 {
    public static void main(String[] args){
        try{
            Scanner input = new Scanner(System.in);

            System.out.println("Enter the first positive integer number:");
            int num1 = input.nextInt();

            System.out.println("Enter the second integer number:");
            int num2 = input.nextInt();

            System.out.println("Enter the third integer number:");
            int num3 = input.nextInt();

            if (num1 <= num2 && num1 <= num3) {
                if (num2 <= num3) {
                    System.out.println("Ascending order: " + num1 + ", " + num2 + ", " + num3);
                } else {
                    System.out.println("Ascending order: " + num1 + ", " + num3 + ", " + num2);
                }
            } else if (num2 <= num1 && num2 <= num3) {
                if (num1 <= num3) {
                    System.out.println("Ascending order: " + num2 + ", " + num1 + ", " + num3);
                } else {
                    System.out.println("Ascending order: " + num2 + ", " + num3 + ", " + num1);
                }
            } else {
                if (num1 <= num2) {
                    System.out.println("Ascending order: " + num3 + ", " + num1 + ", " + num2);
                } else {
                    System.out.println("Ascending order: " + num3 + ", " + num2 + ", " + num1);
                }
            }
        } catch (Exception e) {
            System.out.println("Whats going on pal?");
        }
    }
}
