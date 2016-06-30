package PruebaFabrica;
import fabrica.*;
/**
 * Clase prueba del patrón Factory Method.
 * @author Carlos Aguirre, Daniel Garcia.
 */
public class PruebaFabrica {
     /**
      *  Metodo principal del programa.
      * @param args
      */
    public static void main(String[] args) {
     FabricaUsuario fabricaprofesor = new FabricaProfesor();
     Usuario profesor = fabricaprofesor.crearUsuario();
     profesor.Setnombre("ramiro");
     System.out.println(profesor.getnombre());
     }
}


