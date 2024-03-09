package practices;

/*
Sum of elements

Code a java program that calculates the addition of all the vector integer elements
*/
public class practice_11 {
    public static void main(String[] args){
        try{
            int[] nums = {10,56,43,64,34,79};
            int sum = 0;

            for (int i : nums) {
                sum += i;
            }
            System.out.println("The sum of the elements in the vector is: " + sum);
        }
        catch (Exception e) {
            System.out.println("Whats wrong with you?");
        }
    }
}
