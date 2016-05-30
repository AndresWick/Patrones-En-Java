/**
 *  Clase que representa una salida por consola.
 * @author Carlos
 *
 */
public class ConsoleOutput extends BuildSalida{

	@Override
	public void buildTextoSalida(int numero) {
		salida.setTextOutput(numero);
	}

	@Override
	public void buildTipoDeSalida() {
		salida.setTypeOutput(getSalida().CONSOLA);
	}

}
