/*8. Ejercicio de Generación de Números Aleatorios con Suma:
Escribe un programa en Java que genere dos números enteros aleatorios entre 1 y 10 y
luego solicite al usuario ingresar la suma de esos dos números. El programa debe verificar
si la respuesta es correcta.*/
import java.util.Scanner;
import java.util.Random;
public class ejercicio_8 {
    public static void main(String[] args){
        try{
            Random rand = new Random();
            int num1 = rand.nextInt(10) + 1;
            int num2 = rand.nextInt(10) + 1;

            System.out.println("La suma de " + num1 + " y " + num2 + " es: ");

            Scanner input = new Scanner(System.in);
            int respuesta = input.nextInt();

            if (respuesta == (num1 + num2)) {
                System.out.println("Respuesta correctaaaaaaa");
            } else {
                System.out.println("Incorrecto. La suma es " + (num1 + num2));
            }
        } catch (Exception e) {
            System.out.println("Uy parce hiciste algo mal");
        }
    }
}
