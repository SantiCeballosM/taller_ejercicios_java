import java.util.Scanner;

/*Ejercicio de Verificación de Año Bisiesto:
Crea un programa en Java que solicite al usuario ingresar un
año y determine si es un año bisiesto o no. Un año bisiesto es aquel
divisible por 4, excepto aquellos divisibles por 100 pero no por 400.
Por ejemplo, 2000 y 2400 son años bisiestos, mientras que 1800, 1900
 y 2100 no lo son.*/
public class ejercicio_1 {
    public static void main(String[] args) {
        int ano;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Bienvenido al detector de año biciesto: ");
        System.out.println(" Por favor ingrese el año que desea analizar: ");
        try{
            ano = scanner.nextInt();
            if ((ano % 4 == 0) && (ano % 100 != 0) || (ano % 400 == 0)) {
                System.out.println(ano + " es un año bisiesto.");
            } else {
                System.out.println(ano + " no es un año bisiesto.");
            }
        } catch (Exception e) {
            System.err.println("Error, al parecer estas haciendo algo mal pedaso de idiota");
        }
    }


}
