/*Ejercicio de Cálculo de Intereses Compuestos:
Desarrolla un programa en Java que permita calcular el monto final de una inversión después de un cierto número de años,
utilizando la fórmula de interés compuesto. El programa debe pedir al usuario ingresar la cantidad inicial invertida, la tasa
de interés anual y el número de años. Luego, muestra el monto final.*/

import java.util.Scanner;

public class ejercicio_5 {
    public static void main(String[] args){
        try {


            System.out.println("-------- Calculadora del Monto Final de una Inversión --------");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Cuanto invertiste?");
            double inversionInicial = scanner.nextDouble();

            System.out.println("Ingrese la tasa de interes anual en porcentaje (sin el signo %):");
            double Interes = scanner.nextDouble();

            System.out.println("Ingrese el número de años para la inversión:");
            double anos = scanner.nextDouble();

            double inverF = inversionInicial * Math.pow((1 + (Interes / 100)), anos);
            System.out.println("Total del monto :" + inverF);
        } catch (Exception e) {
            System.out.println("Ups hiciste algo mal");
        }

    }
}
