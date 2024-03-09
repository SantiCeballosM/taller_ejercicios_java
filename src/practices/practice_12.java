package practices;

/*
Product of even elements

Code a java program that find the product of even numbers in an integer vector
*/
public class practice_12 {
    public static void main(String[] args){
        try{
            int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

            int aux = 1;

            for (int i : nums) {
                if (i % 2 == 0) {
                    aux *= i;
                }
            }

            System.out.println("The product of the even numbers in the vector is: " + aux);
        } catch (Exception e) {
            System.out.println("You dummy");
        }
    }
}
