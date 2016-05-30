/**
 *  Clase que representa la entrada por consola del usuario.
 * @author Carlos
 *
 */
public class ConsoleInput extends BuildEntrada{

	@Override
	public void buildTextoEntrada() {
	    entrada.capture();	
	}

	@Override
	public void buildTipoDeEntrada() {
		entrada.setTypeInput(getEntrada().CONSOLA);
	}

}
