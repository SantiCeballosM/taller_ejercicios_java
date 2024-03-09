package practices;

/*
Develop a java code which can find the maximun element of an integer vector,
in other words the largest number
*/
public class practice_13 {
    public static void main(String[] args){
        try {
            int[] nums = {5, 8, 2, 10, 3, 7, 1};

            int max = nums[0];

            for (int i = 1; i < nums.length; i++) {
                if (nums[i] > max) {
                    max = nums[i];
                }
            }

            System.out.println("The largest number in the vector is: " + max);
        } catch (Exception e) {
            System.out.println("that's mean!!");
        }
    }
}
