/**
 *  Clase que representa una salida por ventana emergente.
 * @author Carlos
 *
 */
public class GraphicOutput extends BuildSalida{

	@Override
	public void buildTextoSalida(int numero) {
		salida.setTextOutput(numero);
	}

	@Override
	public void buildTipoDeSalida() {
		salida.setTypeOutput(getSalida().GRAFICA);
	}
	
}
