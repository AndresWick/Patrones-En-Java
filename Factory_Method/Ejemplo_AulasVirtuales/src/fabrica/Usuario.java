package fabrica;
/**
 *  Clase que representa un usuario de UDIN,
 * @author Carlos Aguirre, Daniel Garcia.
 *
 */
public class Usuario {
    /*** Nombre del usuario.*/
	protected String nombre;
	/*** Contraseña del usuario.*/
	protected String contrasena;
	/**
	 *  Modifica el nombre del usuario.
	 * @param nombre
	 */
	public void Setnombre(String nombre) {
		// TODO - implement Usuario.Setnombre
		throw new UnsupportedOperationException();
	}
	/**
	 *  Modifica la contraseña del usuario.
	 * @param contrasena
	 */
	public void SetContrasena(String contrasena) {
		// TODO - implement Usuario.SetContrasena
		throw new UnsupportedOperationException();
	}
    /**
     * Retorna el nombre del usuario.
     * @return
     */
	public String getnombre() {
		return this.nombre;
	}
}

