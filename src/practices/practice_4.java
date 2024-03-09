package practices;/*Ejercicio de Validación de Contraseña:

Create a java code and prompts the user a password, the code verify if the password meet established security criteria.
At least 8 characters in length contain one uppercase letter, lower case letter and one number*/

import java.util.Scanner;

public class practice_4 {
    public static void main(String[] args) {
        try{
            int aux = 0;
            while (aux == 0) {

                System.out.println("It must containe at least 8 characters in lenght with a minimun of one uppercase, lower case, at least one number");
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
                        System.out.println("Congrats fella, you typed the right pass");
                        aux = 1;
                    } else {
                        System.out.println("The password must have at least 1 upper and 1 lower case letter and at least one number.");
                    }
                } else {
                    System.out.println("Password must be at least 8 characters long - try again");
                }
            }
        } catch (Exception e) {
            System.out.println("Damm what u mean?");
        }


    }
}
