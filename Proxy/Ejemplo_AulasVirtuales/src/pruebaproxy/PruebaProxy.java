package pruebaproxy;
import proxy.ProxyEstudiante;
/**
 * Clase de prueba del patr�n Proxy.
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
          // Se intenta ingresar con una contrase�a erronea.
          usuario.solicitudIngreso("654321");
          // Se muestra el usuario.
          usuario.mostrar();
          // Se sale del usuario.
          usuario.salir();
          //------- Ahora vamos a hacerlo con la verdadera contrase�a----//
          // Se intenta ingresar con la contrase�a verdadera.
          usuario.solicitudIngreso("123456");
          // Se muestra el usuario.
          usuario.mostrar();
          // Se sale del usuario.
          usuario.salir();    
    }
}
