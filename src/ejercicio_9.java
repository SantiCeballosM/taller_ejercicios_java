/*9. Ejercicio de Cálculo de Máximo Común Divisor (MCD):
Desarrolla un programa en Java que solicite al usuario ingresar dos números enteros
positivos y luego calcule y muestre su máximo común divisor (MCD).*/

import java.util.Scanner;

public class ejercicio_9 {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);

            System.out.println("Ingresa el primer número: ");
            int num1 = input.nextInt();

            System.out.println("Ingresa el segundo número: ");
            int num2 = input.nextInt();

            while (num2 != 0) {
                int temp = num2;
                num2 = num1 % num2;
                num1 = temp;
            }

            System.out.println("El máximo común divisor de " +num1 +" y " + num2 +" es: "+ num1);
        } catch (Exception e) {
            System.out.println("Parce hiciste algo mal");
        }
    }
}

