/**
 *  Clase prueba del patrón Builder.
 * @author Carlos
 *
 */
public class Test {

	/**
	 *  Metodo principal del programa.
	 * @param args : ...
	 */
	public static void main(String[] args) {
		// Creamos el director.
		Director director= new Director();
		// Creamos las entradas y salidas posibles.
		BuildEntrada entradaConsola = new ConsoleInput();
		BuildSalida salidaConsola = new ConsoleOutput();
		BuildEntrada entradaGrafica = new GraphicInput();
		BuildSalida salidaGrafica = new GraphicOutput();
		// Creamos el convertidor.
		Converter convertidor=new Converter();
		
       // Escogemos la Entrada y la Salida que queramos.
		director.setBuildEntrada(entradaGrafica);
		director.setBuildSalida(salidaGrafica);
		
		// El director construye la Entrada y Salida solicitada.
		director.construirEntrada();
		director.construirSalida(convertidor.convert(director.getEntrada().getTextInput()));
		
		// Creamos una Entrada y una Salida.
		Input entrada = new Input();
		Output salida = new Output();
		
		// Asignamos a la Entrada y Salida anterior las creadas por el director.
		entrada = director.getEntrada();
		salida = director.getSalida();
		
		// Visualizamos la Salida solicitada.
		salida.viewOutput();
	}

}
