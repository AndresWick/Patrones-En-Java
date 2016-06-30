package fabricaabstracta;
/**
 *  Clase que representa el area de Calculo 
 *  en UDIN.
 * @author Carlos Aguirre, Daniel Garcia
 *
 */
public class AreaCalculo extends AreaMatematica {
    @Override
	public void SetCantidadCursos(int cantidadcursos) {
	 this.cantidadDeCursos=cantidadcursos;
	}
    @Override
	public int getCantidaDeCursos() {
		return this.cantidadDeCursos;
	}
}

