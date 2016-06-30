package pruebafabricaabstracta;
import fabricaabstracta.*;
import java.util.Locale;
/**
 *  Clase prueba del patrón Fabrica Abstracta.
 * @author Carlos Aguirre, Daniel Garcia.
 */
public class PruebaFabricaAbstracta {
    /** Metodo principal del programa.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // Creamos una fabrica de areas
      FabricaAreas fabrica = new FabricaAreas2();
      // Creamos una area administrativa
      AreaAdministrativa area = fabrica.crearAreaAdministriva();
      // Creamos una area matematica
      AreaMatematica aream = fabrica.crearAreaMatematica();
      // Establecemos el numero de cursos como 2
      aream.SetCantidadCursos(2);
      // Establecemos el nombre del proyecto del area a
      // INgenieria de sistemas
      area.SetNombreProyectos("Ingenieria de sistemas");
      System.out.println("Nombre del proyecto: "+area.getNombreproyectos());
      System.out.println("Numero de proyecto: "+area.getNumeroproyecto());
      System.out.println("Cantidad de cursos del proyecto: "+
      	aream.getCantidaDeCursos());
    }    
}


