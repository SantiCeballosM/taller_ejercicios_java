package practices;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

/*
Remove odd elements:

Write a program that removes all odd elements from a list.
*/
 class practice_15 {
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

             Iterator<Integer> iterador = myList.iterator();
             while (iterador.hasNext()) {
                 if (iterador.next() % 2 != 0) {
                     iterador.remove();
                 }
             }


             System.out.println("List with no duplicates:  " + myList);
         } catch (Exception e) {
             System.out.println("What the dog doing?");
         }
     }
}
