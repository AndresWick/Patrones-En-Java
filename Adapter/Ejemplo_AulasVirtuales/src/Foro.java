/**
 *  Clase que representa el foro de UDIN.
 *  Representa el Target del patrón Adapter.
 * @author Carlos
 *
 */
public abstract class Foro{
	/**
	 *  Metodo para publicar algo... en el foro.
	 * @param fecha
	 * @param hora
	 */
	public abstract void publicar(String fecha, String hora);
}
