package practices;
/*Average value:

Code a java program that get the HashMap where the keys are the names of students and the values are the
qualifications, then calculate the average for each student.
*/
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class practice_17 {
    public static void main(String[] args){
        try{
            Map<String, List<Integer>> cal_stuudent = new HashMap<>();


            cal_stuudent.put("Student1", List.of(90, 85, 92));
            cal_stuudent.put("Student2", List.of(78, 88, 76));
            cal_stuudent.put("Student3", List.of(95, 89, 93));


            for (Map.Entry<String, List<Integer>> entry : cal_stuudent.entrySet()) {
                String stuudent = entry.getKey();
                List<Integer> resultss = entry.getValue();


                double averagee = 0.0;
                if (!resultss.isEmpty()) {
                    int suma = 0;
                    for (int qualificationnn : resultss) {
                        suma += qualificationnn;
                    }
                    averagee = (double) suma / resultss.size();
                }


                System.out.println("The average result for " + stuudent + " is: " + averagee);
            }
        } catch (Exception e) {
            System.out.println("Whats is going onnnn!!!?");
        }
    }
}
