/**
 * Clase que representa los mensajes del foro en UDIN.
 * Representa el Adapter en el patrón Adapter.
 * @author Carlos
 *
 */
public class MensajeEnForo extends Foro{
	private Mensaje mensaje;

	@Override
	public void publicar(String fecha, String hora) {
		mensaje.enviar(fecha, hora);	
	}
	
	/**
	 *  Constructor parametrico.
	 * @param mensaje
	 */
	public MensajeEnForo(String texto){
		mensaje = new Mensaje(texto);
	}

}
