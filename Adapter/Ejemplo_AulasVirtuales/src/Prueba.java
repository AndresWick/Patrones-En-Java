/**
 *  Clase de prueba.
 * @author Carlos
 *
 */
public class Prueba {
	/**
	 *  Metodo principal.
	 * @param args
	 */
	public static void main(String[] args) {
		// Suponemos que queremos crear un saludo en un foro.
		MensajeEnForo mensaje1 = new MensajeEnForo("HOLA FORO...");
		// Lo publicamos ocn la fecha actual.
		mensaje1.publicar("15/06/2016", "12:10 pm");
	}

}
