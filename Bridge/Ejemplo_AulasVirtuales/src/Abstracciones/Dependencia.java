package Abstracciones;
import Implementaciones.FormaContacto;

public abstract class Dependencia {

	protected String nombre;
	protected FormaContacto formaContacto;
	protected String facultad;
	protected String nomPersonaEncargada;
	protected String correoElectronico;
	protected String telefono;
	protected String direccion;

	public abstract void consultar();
	
	/**
	 * 
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