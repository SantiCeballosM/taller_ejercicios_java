package practices;/*
Remove keys:

Develop a java program to remove all the HashMap keys which have a value less tahn the number entered
*/
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class practice_16 {
    public static void main(String[] args){
        try{
            Map<String, Integer> HM = new HashMap<>();


            HM.put("One", 10);
            HM.put("Two", 5);
            HM.put("Three", 15);
            HM.put("Four", 3);


            int valorUmbral = 8;

            System.out.println("HashMap original: " + HM);


            Iterator<Map.Entry<String, Integer>> iterator = HM.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<String, Integer> entry = iterator.next();
                if (entry.getValue() < valorUmbral) {
                    iterator.remove();
                }
            }

            System.out.println("HashMap after the key remove: " + HM);
        } catch (Exception e) {
            System.out.println("GO GO GO");
        }
    }
}
