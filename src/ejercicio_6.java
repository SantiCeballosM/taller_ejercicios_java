import java.util.Scanner;

/*6. Ejercicio de Generación de Patrón de Asteriscos:
Escribe un programa en Java que solicite al usuario ingresar un número entero positivo.
Luego, muestra un patrón de asteriscos como el siguiente ejemplo, donde cada fila tiene el
mismo número de asteriscos que el número ingresado:
Ejemplo: Pista: Pueden usar un ciclo For y el caracter de salto de linea \n
Si el usuario ingresa 4:
*
**
***
*****/
public class ejercicio_6 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Ingresa un numero positivo:");
            int nuum = scanner.nextInt();
            for (int i = 1; i <= nuum;i++){
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.print("\n");
            }
        } catch (Exception e) {
            System.out.println("Ups al parecer  hicise algo mal");
        }
    }
}
