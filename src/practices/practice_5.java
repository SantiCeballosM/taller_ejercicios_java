package practices;/*Compound Interest Calculator:

Develop a Java program to calculate the final amount of an investment after a certain number of years,
using the compound interest formula. The program should ask the user to enter the initial amount invested, 
the annual interest rate and the number of years, annual interest rate and the number of years. It then displays the final amount.*/

import java.util.Scanner;

public class practice_5 {
    public static void main(String[] args){
        try {


            System.out.println("-------- Compound Interest Calculator --------");
            Scanner scanner = new Scanner(System.in);
            System.out.println("How much you invested?");
            double initial_invest = scanner.nextDouble();

            System.out.println("Enter the annual interest rate in percent (without the % sign): ");
            double Interes = scanner.nextDouble();

            System.out.println("Enter the number of years for the investment: ");
            double anos = scanner.nextDouble();

            double inverF = initial_invest * Math.pow((1 + (Interes / 100)), anos);
            System.out.println("Total del monto :" + inverF);
        } catch (Exception e) {
            System.out.println("Well done you donkey");
        }

    }
}
