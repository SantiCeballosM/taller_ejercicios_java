package practices;

import java.util.Scanner;
/* Currency converter

Code a program which enables a user to covert a amount beetween currencies, the program ask the user to enter a money amount in
a selected currency and exchange rate to a different currency (Dollars to Euros). Then, convert the value and show the total
*/
public class practice_3
{
    public static void main(String[] args){
        System.out.println("------- Currency converter -------\f");
        Scanner digitadoUser = new Scanner(System.in);
        System.out.println("Enter the dollar value to convert:");
        double dolares = digitadoUser.nextDouble();
        Double EurosExchange = 0.92 ;

        Double resu = EurosExchange*dolares;

        System.out.println(dolares +" Dollars, are " + resu + "Euros");

    }
}
