package practices;

import java.util.Scanner;

/*Asterisk Pattern Generation Exercise:

Write a Java program that prompts the user to enter a positive integer.
Then, it displays an asterisk pattern like the following example, where each row has the
same number of asterisks as the number entered:

Example: Hint: You can use a For loop and the linefeed character.
If the user enters 4:
*
**
***
*****/
public class practice_6 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter a positive number:");
            int nuum = scanner.nextInt();
            for (int i = 1; i <= nuum;i++){
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.print("\n");
            }
        } catch (Exception e) {
            System.out.println("yo wtf you did");
        }
    }
}
