package practices;/*Random addition number generator

Code a java program that generate two integer random numbers between 1-10, then prompt the user to enter an addition of those 2 numbers.
The program must verify if the total provited by the user is correct.
*/
import java.util.Scanner;
import java.util.Random;
public class practice_8 {
    public static void main(String[] args){
        try{
            Random rand = new Random();
            int num1 = rand.nextInt(10) + 1;
            int num2 = rand.nextInt(10) + 1;

            System.out.println("The addition of" + num1 + " and " + num2 + " is: ");

            Scanner input = new Scanner(System.in);
            int respuesta = input.nextInt();

            if (respuesta == (num1 + num2)) {
                System.out.println("Well done!!");
            } else {
                System.out.println("Wronng. the addition is " + (num1 + num2) + " dummy");
            }
        } catch (Exception e) {
            System.out.println("Really ?");
        }
    }
}
