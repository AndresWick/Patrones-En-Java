/**
 *  Clase encargada de construir la salida requerida por el usuario.
 * @author Carlos
 *
 */
public abstract class BuildSalida {
	
	/**
	 *  Objeto de tipo Salida que se creará.
	 */
	protected Output salida;

	
	
	
	/**
	 *  Metodo que retorna la salida.
	 * @return : salida.
	 */
	public Output getSalida() {
		return this.salida;
	}

	/**
	 *  Metodo que reemplaza la salida.
	 * @param salida : nueva salida.
	 */
	public void setSalida(Output salida) {
		this.salida = salida;
	}

	/**
	 * Metodo que instancia la salida.
	 */
	public void crearNuevaSalida(){
		salida = new Output();
	}

	/**
	 * Metodo encargado de construir el texto de salida.
	 * @param numero : número que arrojará la salida.
	 */
	public abstract void buildTextoSalida(int numero);

	/**
	 * Metodo encargado de construir el tipo de salida.
	 */
	public abstract void buildTipoDeSalida();
}
