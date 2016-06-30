package fabrica;
/**
 *  CLase que representa un profesor.
 * @author Carlos Aguirre, Daniel Garcia.
 *
 */
public class Profesor extends Usuario {
   /*** Cargo del profesor */
	private String cargo;
	/**
	 *  Modifica el nombre del profesor.
	 * @param nombre
	 */
	public void Setnombre(String nombre) {
		this.nombre=nombre;
	}
	/**
	 *  Modifica la contraseña del profesor.
	 * @param contrasena
	 */
	public void SetContrasena(String contrasena) {
		this.contrasena=contrasena;
	}
    /**
     *  Retorna el nombre del profesor.
     */
	public String getnombre() {
	  return this.nombre;
	}
	/**
	 * Modifica el cargo del profesor.
	 * @param cargo
	 */
	public void SetCargo(String cargo) {
		this.cargo=cargo;
	}
    /**
     *  Retorna el cargo del profesor.
     * @return
     */
	public String getcargo() {
		return this.cargo;
	}
}
