/**
 *  Clase prueba del patrón Flyweight.
 * @author Carlos Aguirre, Daniel Garcia.
 *
 */
public class Prueba {
  /**
   * Metodo principal del programa. 
   * @param args
   */
	public static void main(String[] args) {
		// Creamos unos nombres de estudiantes.
     String nombres[] = {"Daniel Garcia","Carlos Aguirre","Pedro Hernandez"};
        // Creamos unos apellidos de estudiantes.
     String codigos[] = {"20141020212","20141020215","20141020128"};
        // Creamos unass notas de estudiantes.
     double notas[] = {5.0,4.0,3.0};
        // Asignamos el promedio de los estudiantes del aula.
     AulaVirtual aula = new AulaVirtual(3.7);
        // Consultamos los promedios de cada uno de los estudiantes.
     for(int i=0;i<3;i++){
    	 aula.consultarPromedioEstudiante(nombres[i], codigos[i], notas[i]);
     }
	}
}
