package fabrica;
/**
 *  Clase fabrica del profesor.
 * @author Carlos Aguirre, Daniel Garcia.
 *
 */
public class FabricaProfesor extends FabricaUsuario {
  /**
   * Metodo que crea el usuario profesor.  
   */
    public Usuario crearUsuario() {
        Usuario profesor = new Profesor();
        return profesor;
    }
}
