
package pruebacadenaresponsabilidad;
import cadenaresposabilidad.*;
import javax.swing.JOptionPane;
/**
 * Clase prueba del patrón Cadena de responsabilidad.
 * @author Carlos Aguirre, Daniel Garcia.
 */
public class PruebaCadenaResponsabilidad {
     public static void main(String[] args) {
         /**
          * Objeto que permite clasificar los cursos
          */
        NivelEstudio grado=new Grado();
        /**
         * Entrada de la etiqueta para clasificar el curso
         */
        grado.Clasificar(JOptionPane.showInputDialog(null,"Introdusca palabra para clasificar"));
    }
}
