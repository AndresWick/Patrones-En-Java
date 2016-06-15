package Implementaciones;
/**
 *  CLase que representa la forma de contacto.
 * @author Carlos Aguirre, Daniel Garcia.
 *
 */
public abstract class FormaContacto {
	protected String tipoContacto;
	/**
	 * COnstructor por defecto.
	 */
	public FormaContacto(){
		tipoContacto = null;
	}
	/**
	 * Permite establecer la forma de contacto.
	 */
	public abstract void contactar();
	public String getTipoContacto() {
		return tipoContacto;
	}
}