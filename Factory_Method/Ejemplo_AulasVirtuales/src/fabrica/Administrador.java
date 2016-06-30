package fabrica;
/**
 *  Clase que representa un usuario administrador.
 * @author Carlos Aguirre , Daniel Garcia.
 *
 */
public class Administrador extends Usuario {
    /*** Funcion del administrador.*/
	private String funcion;
        @Override
	public void Setnombre(String nombre) {
		this.nombre=nombre;
	}
        @Override
	public void SetContrasena(String contrasena) {
		this.contrasena=contrasena;
	}
        @Override
	public String getnombre() {
		return this.nombre;
	}
	/**
	 * Modifica la funcion del administrador.
	 * @param funcion
	 */
	public void setFuncion(String funcion) {
		this.funcion = funcion;
	}
    /**
     * Retorna la funcion del administrador.
     * @return
     */
	public String getfuncion() {
		return this.funcion;
	}
}