package fabrica;
/**
 *  Clase fabrica de administrador.
 * @author Carlos Aguirre, Daniel Garcia.
 *
 */
public class FabricaAdministrador extends FabricaUsuario {
  /**
   * Metodo encargado de crear el usuario administrador. 
   */
    public Usuario crearUsuario() {
        Usuario administrador = new Administrador();
        return administrador;
    }
}

