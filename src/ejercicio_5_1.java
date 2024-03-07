import java.util.Scanner;

public class ejercicio_5_1 {
    /*Ejercicio de Suma de Dígitos:
     Escribe un programa en Java que solicite al usuario ingresar un número entero positivo.

     Luego, suma todos los dígitos del número y muestra el resultado.
     Ejemplo: Usuario ingresa 12 → El programa retorna 3 SumDigitos = 1+2= 3*/
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Ingresa un numero positivo: ");
            int num = scanner.nextInt();
            int sum = 0;
            int numI = num;
            while(num > 0){
                sum += num %10;
                num /= 10;
            }
            System.out.println("La suma de los digitos de "+numI+ " es "+sum);
        } catch (Exception e) {
            System.out.println("Ups parce hiciste algo mal");
        }
    }
    }
