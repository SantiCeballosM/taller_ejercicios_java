/*16. . Eliminar claves:
Escribir un programa que elimine todas las claves de un HashMap que tengan
un valor menor que un número dado.*/
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class ejercicio_16 {
    public static void main(String[] args){
        try{
            Map<String, Integer> HM = new HashMap<>();


            HM.put("Uno", 10);
            HM.put("Dos", 5);
            HM.put("Tres", 15);
            HM.put("Cuatro", 3);


            int valorUmbral = 8;

            System.out.println("HashMap original: " + HM);


            Iterator<Map.Entry<String, Integer>> iterator = HM.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<String, Integer> entry = iterator.next();
                if (entry.getValue() < valorUmbral) {
                    iterator.remove();
                }
            }

            System.out.println("HashMap después de eliminar claves: " + HM);
        } catch (Exception e) {
            System.out.println("Uy parce hiciste algo mal");
        }
    }
}
