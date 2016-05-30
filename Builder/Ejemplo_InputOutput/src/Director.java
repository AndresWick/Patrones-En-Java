/**
 *  Clase encargada de construir las entrada y salida requerida.
 * @author Carlos
 *
 */
public class Director {
	
	/**
	 *  Constructor de la entrada.
	 */
	private BuildEntrada buildEntrada;
	/**
	 *  Constructor de la salida.
	 */
	private BuildSalida buildSalida;
	
	
	
	/**
	 *  Metodo encargado de devolver la entrada del constructor de entrada.
	 * @return : entrada de buildEntrada.
	 */
	public Input getEntrada() {
		return buildEntrada.getEntrada();
	}
	
	/**
	 *  Metodo encargado de devolver la salida del constructor de salida.
	 * @return : salida de buildSalida.
	 */
	public Output getSalida() {
		return buildSalida.getSalida();
	}
	
	/**
	 *  Metodo encargado de redefinir el constructor de la entrada.
	 * @param buildEntrada : nuevo constructor de entrada.
	 */
	public void setBuildEntrada(BuildEntrada buildEntrada) {
		this.buildEntrada = buildEntrada;
	}

	/**
	 *  Metodo encargado de redefinir el constructor de la salida.
	 * @param buildSalida : nuevo constructor de la salida.
	 */
	public void setBuildSalida(BuildSalida buildSalida) {
		this.buildSalida = buildSalida;
	}
	
	/**
	 *  Metodo encargado de construir como tal la entrada.
	 */
	public void construirEntrada(){
		buildEntrada.crearNuevaEntrada();
		buildEntrada.buildTipoDeEntrada();
		buildEntrada.buildTextoEntrada();
	}
	
	/**
	 *  Metodo encargado de construir como tal la salida.
	 * @param numero : valor a asignar como texto de salida.
	 */
	public void construirSalida(int numero){
		buildSalida.crearNuevaSalida();
		buildSalida.buildTipoDeSalida();
		buildSalida.buildTextoSalida(numero);
	}

}


