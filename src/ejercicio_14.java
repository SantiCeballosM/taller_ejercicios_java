/*14. Eliminar duplicados:
Escribir un programa que elimine los elementos duplicados de una lista.*/
import java.util.ArrayList;
import java.util.List;
public class ejercicio_14 {
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

            System.out.println("Lista original: " + myList);

            for (int i = 0; i < myList.size(); i++) {
                for (int j = i + 1; j < myList.size(); j++) {
                    if (myList.get(i).equals(myList.get(j))) {
                        myList.remove(j);
                        j--;
                    }
                }
            }

            System.out.println("Lista sin duplicados: " + myList);
        } catch (Exception e) {
            System.out.println("Uy parce hiciste algo mal");
        }
    }
}
