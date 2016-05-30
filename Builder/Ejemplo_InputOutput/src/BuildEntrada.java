/**
 *  Clase encargada de crear la entrada requerida por el usuario.
 * @author Carlos
 *
 */
public abstract class BuildEntrada {

	/**
	 *  Objeto de tipo Entrada que se creará.
	 */
	protected Input entrada;
	
	
	
	/**
	 *  Metodo que retorna la entrada.
	 * @return : entrada.
	 */
	public Input getEntrada() {
		return this.entrada;
	}

	/**
	 *  Metodo encargado de reemplazar la entrada.
	 * @param entrada : nueva entrada.
	 */
	public void setEntrada(Input entrada) {
		this.entrada = entrada;
	}

	/**
	 * Metodo encargado de instanciar la entrada.
	 */
	public void crearNuevaEntrada() {
		entrada = new Input();
	}

	/**
	 *  Metodo encargado de constriur el texto de la entrada.
	 */
	public abstract void buildTextoEntrada();

	/**
	 *  Metodo encargado de construir el tipo de entrada.
	 */
	public abstract void buildTipoDeEntrada();
	
}


