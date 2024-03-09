import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

/*15. Eliminar elementos impares:
Escribir un programa que elimine todos los elementos impares de una lista.*/
 class ejercicio_15 {
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

             Iterator<Integer> iterador = myList.iterator();
             while (iterador.hasNext()) {
                 if (iterador.next() % 2 != 0) {
                     iterador.remove();
                 }
             }


             System.out.println("Lista sin duplicados: " + myList);
         } catch (Exception e) {
             System.out.println("Hiciste algo mal");
         }
     }
}
