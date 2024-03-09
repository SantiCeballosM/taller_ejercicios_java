package practices;
/* Calculate repeated digits in a number

Code a java program that prompts the user to enter an integer positive number and a digit,
then count and show how many times that digit appears in the entered number
*/
import java.util.Scanner;
public class practice_10 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        try{
            int cont= 0 ;
            System.out.println("Enter a 2 digits number: ");
            int num = input.nextInt();

            System.out.println("Enter the digit to find: ");
            int dig = input.nextInt();

            while (num > 0) {
                int lastDigit = num % 10;
                if (lastDigit == dig) {
                    cont++;
                }
                num /= 10;
            }
            if (cont == 0) {
                System.out.println(" This digit doesn't exist in the entered number ");
            }else{
                System.out.println("This digit appears: "+cont+ " times in the number");
            }


        } catch (Exception e) {
            System.out.println("What?, i do not understand spaniol");
        }
    }
}
