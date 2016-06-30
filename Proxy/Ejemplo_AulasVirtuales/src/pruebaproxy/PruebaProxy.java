package pruebaproxy;
import proxy.ProxyEstudiante;
/**
 * Clase de prueba del patrón Proxy.
 * @author Carlos Aguirre, Daniel Garcia.
 */
public class PruebaProxy {
    /**
     *  Metodo principal del programa.
     * @param args
     */
      public static void main(String[] args) {
      	// Se crea un usuario proxyEstudiante.
    	  ProxyEstudiante usuario = new ProxyEstudiante("Pedro Hernandez","123456");
          // Se intenta ingresar con una contraseña erronea.
          usuario.solicitudIngreso("654321");
          // Se muestra el usuario.
          usuario.mostrar();
          // Se sale del usuario.
          usuario.salir();
          //------- Ahora vamos a hacerlo con la verdadera contraseña----//
          // Se intenta ingresar con la contraseña verdadera.
          usuario.solicitudIngreso("123456");
          // Se muestra el usuario.
          usuario.mostrar();
          // Se sale del usuario.
          usuario.salir();    
    }
}
