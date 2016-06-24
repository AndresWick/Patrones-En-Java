package pruebaEstrategia;
import estrategia.*;
/**
 * Clase prueba del patrón Estrategia.
 * @author Carlos Aguirre, Daniel Garcia.
 *
 */
public class PruebaEstrategia {
/**
 * Metodo principal del juego.
 * @param args
 */
    public static void main(String[] args) {
    	// Creamos un ingreso como estudiante
      Ingreso ingreso = new IngresoEstudiante();
      // Creamos un usuario cualquiera
      Usuario usuario = new Usuario();
      // Establecemos el ingreso al usuario como estudiante
      usuario.setIngreso(ingreso);
      // Ingresamos con el Usuario.
      usuario.ingresar();
    }
}


