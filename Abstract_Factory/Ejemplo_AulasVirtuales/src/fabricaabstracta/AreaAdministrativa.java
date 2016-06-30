package fabricaabstracta;
/**
 *  Clase que representa el area administrativa 
 *  en UDIN.
 * @author Carlos Aguirre, Daniel Garcia.
 *
 */
public abstract class AreaAdministrativa {
    /*** Nombres de los proyectos del area.*/
	protected String nombresProyectos;
	/*** Numero de proyectos del area.*/
	protected int numeroProyectos;            
	/**
	 * Modifica el nombre de los proyectos del area.
	 * @param nombre
	 */
	public abstract void SetNombreProyectos(String nombre);
	/**
	 *  Modifica el numero de proyectos del area.
	 * @param numero
	 */
	public abstract void SetNumeroProyectos(int numero);
    /**
     *  Retorna el nombre de los proyectos del area.
     * @return
     */
	public  abstract String getNombreproyectos();
    /**
     * Retorna el numero de proyectos del area.
     * @return
     */
	public  abstract int getNumeroproyecto();
}



