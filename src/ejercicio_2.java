import java.util.Random;
import java.util.Scanner;

public class ejercicio_2 {
    public static void main(String[] args) {
        int sel;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al juego de piedra, papel o tijeras :3");
        System.out.println("Estas son las opciones en numeros");
        System.out.println("Número 1 para tijeras\nNúmero 2 para piedra\nNúmero 3 para papel");

        try {
            int aux = 0;
            while (aux == 0) {
                Random random = new Random();
                int numeroAleatorio = random.nextInt(3) + 1; // Ajustar el rango para que sea 1, 2 o 3
                System.out.println("Ingresa el número: ");
                sel = scanner.nextInt();

                if (sel >= 1 && sel <= 3) {
                    System.out.println("El número que elegiste fue: " + sel + " y el número que eligió la máquina fue: " + numeroAleatorio);

                    if (sel == numeroAleatorio) {
                        System.out.println("Empate");
                    } else if ((sel == 1 && numeroAleatorio == 3) || (sel == 2 && numeroAleatorio == 1) || (sel == 3 && numeroAleatorio == 2)) {
                        System.out.println("¡Ganaste!");
                    } else {
                        System.out.println("La máquina gana");
                    }

                    aux = 1; // Salir del bucle después de una jugada
                } else {
                    System.out.println("Número no válido, por favor ingresa un número entre 1 y 3");
                }
            }
        } catch (Exception e) {
            System.out.println("Ups.. has hecho algo mal");
        }
    }
}
