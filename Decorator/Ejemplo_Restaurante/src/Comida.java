/**
 *  Clase que representa los tipos de alimentos del restaurante.
 * @author Carlos
 *
 */
public abstract class Comida {
	/**
	 *  Descripcion del alimento.
	 */
	protected String descripcion;
	/**
	 *  Precio del alimento.
	 */
	protected int precio;




	/**
	 *  Metodo encargado de retornar el precio del alimento.
	 */
	public abstract int getPrecio();
	/**
	 *  Metodo encargado de retornar la descripcion del alimento.
	 */
	public abstract String getDescripcion();
}
