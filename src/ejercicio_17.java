/*17. Promedio de valores:
Escribir un programa que tome un HashMap donde las claves son nombres de
estudiantes y los valores son listas de calificaciones, y calcule el promedio de calificaciones
para cada estudiante.*/
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ejercicio_17 {
    public static void main(String[] args){
        try{
            Map<String, List<Integer>> cal_estudiante = new HashMap<>();


            cal_estudiante.put("Estudiante1", List.of(90, 85, 92));
            cal_estudiante.put("Estudiante2", List.of(78, 88, 76));
            cal_estudiante.put("Estudiante3", List.of(95, 89, 93));


            for (Map.Entry<String, List<Integer>> entry : cal_estudiante.entrySet()) {
                String estudiante = entry.getKey();
                List<Integer> calificaciones = entry.getValue();


                double promedio = 0.0;
                if (!calificaciones.isEmpty()) {
                    int suma = 0;
                    for (int calificacion : calificaciones) {
                        suma += calificacion;
                    }
                    promedio = (double) suma / calificaciones.size();
                }


                System.out.println("Promedio de calificaciones para " + estudiante + ": " + promedio);
            }
        } catch (Exception e) {
            System.out.println("Hiciste algo mal");
        }
    }
}
