package practices;/*
Remove duplicate:

Write a program that removes duplicate elements from a list.
*/
import java.util.ArrayList;
import java.util.List;
public class practice_14 {
    public static void main(String[] args){
        try{
            List<Integer> myList = new ArrayList<>();
            myList.add(1);
            myList.add(2);
            myList.add(3);
            myList.add(4);
            myList.add(3);
            myList.add(2);
            myList.add(1);
            myList.add(5);

            System.out.println("Original list: " + myList);

            for (int i = 0; i < myList.size(); i++) {
                for (int j = i + 1; j < myList.size(); j++) {
                    if (myList.get(i).equals(myList.get(j))) {
                        myList.remove(j);
                        j--;
                    }
                }
            }

            System.out.println("List with no duplicates: " + myList);
        } catch (Exception e) {
            System.out.println("Sus");
        }
    }
}
