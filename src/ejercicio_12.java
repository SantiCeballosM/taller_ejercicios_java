/*12. Producto de elementos pares:
Escribir un programa que encuentre el producto de todos los números pares en un vector de
enteros.*/
public class ejercicio_12 {
    public static void main(String[] args){
        try{
            int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

            int aux = 1;

            for (int i : nums) {
                if (i % 2 == 0) {
                    aux *= i;
                }
            }

            System.out.println("El producto de los números pares en el vector es: " + aux);
        } catch (Exception e) {
            System.out.println("Hiciste algo mal");
        }
    }
}
