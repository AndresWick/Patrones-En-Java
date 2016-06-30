package fabricaabstracta;
/**
 *  Clase que representa el area directiva
 *  de UDIN.
 * @author Carlos Aguirre, Daniel Garcia.
 *
 */
public class AreaDirectiva extends AreaAdministrativa {
	 @Override
	public void SetNombreProyectos(String nombre) {
		this.nombresProyectos = nombre;
	}
	 @Override
	public void SetNumeroProyectos(int numero) {
		this.numeroProyectos = numero;
	}
	@Override
	public String getNombreproyectos() {
		return this.nombresProyectos;
	}
	@Override
	public int getNumeroproyecto() {
		return this.numeroProyectos;
	}
}



