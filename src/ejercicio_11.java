/*11. Suma de elementos:
Escribir un programa que calcule la suma de todos los elementos en un vector de enteros.*/
public class ejercicio_11 {
    public static void main(String[] args){
        try{
            int[] nums = {10,56,43,64,34,79};
            int suma = 0;

            for (int i : nums) {
                suma += i;
            }
            System.out.println("La suma de los elementos en el vector es: " + suma);
        }
        catch (Exception e) {
            System.out.println("Upsss hiciste algo mal");
        }
    }
}
