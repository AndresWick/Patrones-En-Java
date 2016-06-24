package patronbuilder;
/**
 *  Clase que representa la pagina de Login.
 * @author Carlos Aguirre, Daniel Garcia.
 *
 */
public class PaginaLogin {
  /*** Nombre de la pagina */
	private String nombre;
	/*** Alto de la pagina */
	private int alto;
	/*** Ancho de la pagina */
	private int ancho;
 /**
 * Retorna el nombre de la pagina.
 * @return
 */
    public String getNombre() {
        return nombre;
    }
 /**
 *  Modifica el nombre de la pagina.
 * @param nombre
 */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 /**
 *  Retorna el alto de la pagina.
 * @return
 */
    public int getAlto() {
        return alto;
    }
 /**
 * Modifica el alto de la pagina.
 * @param alto
 */
    public void setAlto(int alto) {
        this.alto = alto;
    }
 /**
 *  Retorna el ancho de la pagina.
 * @return
 */
    public int getAncho() {
        return ancho;
    }
 /**
 * Modifica el ancho de la pagina.
 * @param ancho
 */
    public void setAncho(int ancho) {
        this.ancho = ancho;
    }    
}