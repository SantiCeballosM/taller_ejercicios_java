/*13. Escribir un programa que encuentre el elemento máximo en un vector de enteros. es
decir el número más grande*/
public class ejercicio_13 {
    public static void main(String[] args){
        try {
            int[] nums = {5, 8, 2, 10, 3, 7, 1};

            int max = nums[0];

            for (int i = 1; i < nums.length; i++) {
                if (nums[i] > max) {
                    max = nums[i];
                }
            }

            System.out.println("El numero mas grande en el vector es: " + max);
        } catch (Exception e) {
            System.out.println("Uy lo siento hiciste algo mal");
        }
    }
}
