/*7. Ejercicio de Ordenamiento de Números (sin utilizar arreglos):
Crea un programa en Java que solicite al usuario ingresar tres números enteros.
Luego, muestra los números en orden ascendente, utilizando condicionales para determinar
cuál es el mayor, el intermedio y el menor.*/
import java.util.Scanner;
public class ejercicio_7 {
    public static void main(String[] args){
        try{
            Scanner input = new Scanner(System.in);

            System.out.println("Ingrese el primer número entero:");
            int num1 = input.nextInt();

            System.out.println("Ingrese el segundo número entero:");
            int num2 = input.nextInt();

            System.out.println("Ingrese el tercer número entero:");
            int num3 = input.nextInt();

            if (num1 <= num2 && num1 <= num3) {
                if (num2 <= num3) {
                    System.out.println("Orden ascendente: " + num1 + ", " + num2 + ", " + num3);
                } else {
                    System.out.println("Orden ascendente: " + num1 + ", " + num3 + ", " + num2);
                }
            } else if (num2 <= num1 && num2 <= num3) {
                if (num1 <= num3) {
                    System.out.println("Orden ascendente: " + num2 + ", " + num1 + ", " + num3);
                } else {
                    System.out.println("Orden ascendente: " + num2 + ", " + num3 + ", " + num1);
                }
            } else {
                if (num1 <= num2) {
                    System.out.println("Orden ascendente: " + num3 + ", " + num1 + ", " + num2);
                } else {
                    System.out.println("Orden ascendente: " + num3 + ", " + num2 + ", " + num1);
                }
            }
        } catch (Exception e) {
            System.out.println("Ups hiciste algo mal compañero");
        }
    }
}
