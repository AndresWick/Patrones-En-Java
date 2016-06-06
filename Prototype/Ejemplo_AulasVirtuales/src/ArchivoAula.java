/**
 *  Clase que representa una archivo.
 * @author Carlos
 *
 */
public class ArchivoAula {
	/**
	 *  Nombre del archivo.
	 */
	private String nombre;
	/**
	 *  Formato del archivo.
	 */
	private String formato;
	
	/**
	 *  Conctructor parametrico.
	 * @param nombre
	 * @param formato
	 */
	public ArchivoAula(String nombre, String formato){
	    this.nombre = nombre;
	    this.formato = formato;
	}

	/**
	 * Metodo que permite crear una copia del archivo.
	 * @return
	 */
	public ArchivoAula descargarArchivo(){
		ArchivoAula nuevoArchivo = this;
		nuevoArchivo.setNombre(this.nombre);
		nuevoArchivo.setFormato(this.formato);
		return nuevoArchivo;
	}

	/**
	 *  Metodo que retorna el nombre del archivo.
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 *  Metodo que retorna el formato del archivo.
	 * @return
	 */
	public String getFormato() {
		return formato;
	}

	/**
	 *  Metodo que redefine el nombre del arhivo.
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 *  Metodo que redefine el formato del arhivo.
	 * @param formato
	 */
	public void setFormato(String formato) {
		this.formato = formato;
	}	
}
