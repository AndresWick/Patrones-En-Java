package Implementaciones;
/**
 *  Clase que representa el contacto por
 *  medio de correo electronico.
 * @author Carlos Aguirre, Daniel Garcia.
 */
public class ContactoCorreo extends FormaContacto {
	/**
	 * Permite establecer la forma de contacto.
	 */
	public void contactar() {
		tipoContacto = "CORREO";
	}
}