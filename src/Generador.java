import java.util.ArrayList;
import java.util.List;
public class Generador {
    public static List<Estudiante> generarEstudiantes(int cantidadEstudiantes){
        List<Estudiante> estudiantes= new ArrayList<>();
        for(int i = 0; i<cantidadEstudiantes; i++){
            String cedula = i+"";
            String nombre = "Estudiante_"+i;
            Estudiante estudiante = new Estudiante(cedula, nombre);
            estudiantes.add(estudiante);
        }
        return estudiantes;
    }
}
