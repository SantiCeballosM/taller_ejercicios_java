import java.util.Scanner;
/*Ejercicio de Conversión de Moneda:
Escribe un programa en Java que permita al usuario convertir una cantidad de dinero
de una moneda a otra. El programa debe pedir al usuario ingresar la cantidad de dinero
en una moneda (por ejemplo, dólares) y la tasa de cambio a la otra moneda (por ejemplo, euros).
Luego, debe realizar la conversión y mostrar el resultado.*/
public class ejercicio_3
{
    public static void main(String[] args){
        System.out.println("------- Conversor de Dolares a Euros -------\f");
        Scanner digitadoUser = new Scanner(System.in);
        System.out.println("Ingrese el valor en Dolares que desee convertir :");
        double dolares = digitadoUser.nextDouble();
        Double tasaEuros = 0.92 ;

        Double resu = tasaEuros*dolares;

        System.out.println(dolares +" Dolares, son " + resu + "Euros");

    }
}
