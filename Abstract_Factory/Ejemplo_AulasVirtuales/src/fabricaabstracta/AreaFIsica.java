package fabricaabstracta;
/**
 *  Clase que representa el area de Fisica de UDIN.
 * @author Carlos Aguirre, Daniel Garcia.
 *
 */
public class AreaFIsica extends AreaMatematica {
	/**
	 *  Establece la cantidad de cursos de esta area.
	 * @param cantidadcursos
	 */
	public void SetCantidadCursos(int cantidadcursos) {
		 this.cantidadDeCursos=cantidadcursos;
	}
  /**
   *  Retorna la cantidad de cursos de esta area.
   */
	public int getCantidaDeCursos() {
		return this.cantidadDeCursos;
	}
}

