package Abstracciones;
import Implementaciones.FormaContacto;
/**
 * Clase que representa la dependencia de la facultad de ingenieria.
 * @author Carlos Aguirre, Daniel Garcia.
 *
 */
public abstract class Dependencia {
	// Datos basicos de cualquier dependencia.
	protected String nombre;
	protected FormaContacto formaContacto;
	protected String facultad;
	protected String nomPersonaEncargada;
	protected String correoElectronico;
	protected String telefono;
	protected String direccion;
/**
 * Permite consultar la dependencia.
 */
public abstract void consultar();
	
/**
*  Constructor parametrico.
* @param formaContacto
*/
public Dependencia(FormaContacto formaContacto) {
		this.formaContacto = formaContacto;
	}
	public String getNombre() {
		return nombre;
	}
	public FormaContacto getFormaContacto() {
		return formaContacto;
	}
	public String getNomPersonaEncargada() {
		return nomPersonaEncargada;
	}
	public String getCorreoElectronico() {
		return correoElectronico;
	}
	public String getTelefono() {
		return telefono;
	}
	public String getDireccion() {
		return direccion;
	}
}