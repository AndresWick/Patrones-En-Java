/**
 *  Clase que representa la entrada por ventana emergente del usuario.
 * @author Carlos
 *
 */
public class GraphicInput extends BuildEntrada{

	@Override
	public void buildTextoEntrada() {
		  entrada.capture();	
	}

	@Override
	public void buildTipoDeEntrada() {
		entrada.setTypeInput(getEntrada().GRAFICA);
	}

}
