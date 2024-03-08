/*10. Ejercicio de Cálculo de Dígitos Repetidos en un Número:
Desarrolla un programa en Java que solicite al usuario ingresar un número entero positivo y
un dígito, y luego cuente y muestre cuántas veces aparece ese dígito en el número
ingresado.*/
import java.util.Scanner;
public class ejercicio_10 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        try{
            int cont= 0 ;
            System.out.println("Ingresa un numero de 2 digitos: ");
            int num = input.nextInt();

            System.out.println("Ingresa un digito: ");
            int dig = input.nextInt();

            while (num > 0) {
                int ultimoDigito = num % 10;
                if (ultimoDigito == dig) {
                    cont++;
                }
                num /= 10;
            }
            if (cont == 0) {
                System.out.println("ese digito no existe en el numero dado");
            }else{
                System.out.println("Si, ese digito esta: "+cont+ " Veces en el numero dado");
            }


        } catch (Exception e) {
            System.out.println("Uy parce hiciste algo mal");
        }
    }
}
