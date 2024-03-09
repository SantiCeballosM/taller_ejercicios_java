package practices;

import java.util.Scanner;
/*Digit Sum:
Write a Java program that prompts the user to enter a positive integer.

It then adds up all the digits of the number and displays the result.
Example: User enters 12 → The program returns 3 SumDigits = 1+2= 3*/
public class practice_5_1 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Enter a positive number: ");
            int num = scanner.nextInt();
            int sum = 0;
            int numI = num;
            while(num > 0){
                sum += num %10;
                num /= 10;
            }
            System.out.println("The sum of digits of "+numI+ " is "+sum);
        } catch (Exception e) {
            System.out.println("What the heck");
        }
    }
    }
