package patronbuilder;
/**
 *  Clase que representa un aula virtual de UDIN.
 * @author Carlos Aguirre, Daniel Garcia.
 *
 */
public class AulaVirtual {
    /*** nombre del aula virtual */
    private String nombre;
    /*** ancho del aula virtual */
    private int ancho;  
    /*** alto del aula virtual */
    private int alto;
    /**
     *  Retorna el nombre del aula virtual
     * @return
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Modifica el nombre del aula virtual.
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     *  Retorna el ancho del aula virtual
     * @return
     */
    public int getAncho() {
        return ancho;
    }
    /**
     * Cambia el ancho del aula virtual
     * @param ancho
     */
    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
    /**
     * Retorna el alto del aula virtual
     * @return
     */
    public int getAlto() {
        return alto;
    }
    /**
     *  cambiar alto del aula virtual
     * @param alto
     */
    public void setAlto(int alto) {
        this.alto = alto;
    }
}


