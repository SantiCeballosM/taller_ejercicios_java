package practices;

import java.util.Scanner;

/*Verify Leap-Year:

Create a Java code that prompts the user to enter a year and find if the year is Leap-Year.
A Leap-Year is which can be divided by 4, with exception of who can divide by 100 but not 400.

Example, 2000 and 2400 are Leap-years, while 1800, 1900 and 2100 aren't*/
public class practice_1 {
    public static void main(String[] args) {
        int ano;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Welcome to Leap-Year Checker: ");
        System.out.println(" Please, enter the year you want to check ");
        try{
            ano = scanner.nextInt();
            if ((ano % 4 == 0) && (ano % 100 != 0) || (ano % 400 == 0)) {
                System.out.println(ano + " its a Leap-Year");
            } else {
                System.out.println(ano + " it isn't a Leap-Year");
            }
        } catch (Exception e) {
            System.err.println("Fatal error, it looks you're doing wrong dumb ass");
        }
    }


}
