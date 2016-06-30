package fabricaabstracta;
/**
 *  Clase que representa el area matematica 
 *  en UDIN.
 * @author Carlos Aguirre, Daniel Garcia.
 *
 */
public abstract class AreaMatematica {
    /*** Cantidad de cursos del Area matematica.*/
	protected int cantidadDeCursos;
	/**
	 *  Modifica la cantidad de cursos.
	 * @param cantidadcursos
	 */
	public abstract void SetCantidadCursos(int cantidadcursos) ;
    /**
     *  Retorna la cantidad de cursos.
     * @return
     */
	public abstract int getCantidaDeCursos() ;
}

