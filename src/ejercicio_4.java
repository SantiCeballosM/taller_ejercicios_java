/*Ejercicio de Validación de Contraseña:
Crea un programa en Java que pida al usuario ingresar una contraseña. El programa debe verificar si
la contraseña cumple con ciertos criterios de seguridad, como tener al menos 8 caracteres de longitud y contener
al menos una letra mayúscula, una letra minúscula y un número.*/

import java.util.Scanner;

public class ejercicio_4 {
    public static void main(String[] args) {
        try{
            int aux = 0;
            while (aux == 0) {

                System.out.println("Debe tener almenos 8 caractares con minimo 1 letra Mayuscula, 1 letra minusculas y almenos un número");
                Scanner contra = new Scanner(System.in);
                String contrasena = contra.nextLine();

                int mayus = 0;
                int minus = 0;
                int number = 0;

                if (contrasena.length() >= 8) {
                    for (int i = 0; i < contrasena.length(); i++) {

                        char cara = contrasena.charAt(i);

                        if (Character.isUpperCase(cara)) {
                            mayus++;
                        } else if (Character.isLowerCase(cara)) {
                            minus++;
                        } else if (Character.isDigit(cara)) {
                            number++;
                        }
                    }
                    if (mayus >= 1 && minus >= 1 && number >= 1) {
                        System.out.println("Felicidades parcerito , metiste la contra que era");
                        aux = 1;
                    } else {
                        System.out.println("La contraseña debe tener minimo 1 letra Mayuscula y 1 letra minusculas y almenos un númer");
                    }
                } else {
                    System.out.println("La contraseña debe tener minimo 8 caracteres - vuelva a intentarlo");
                }
            }
        } catch (Exception e) {
            System.out.println("Ups algo salio mal");
        }


    }
}
