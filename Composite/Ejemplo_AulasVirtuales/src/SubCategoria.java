/**
 *  Clase que representa una categoria de una categoria.
 * @author Carlos Aguirre, Daniel Garcia.
 *
 */
public class SubCategoria extends CategoriaUdin{
	/**
	 *  COnstructor parametrico de Sub-categorias.
	 * @param nombre
	 */
	public SubCategoria(String nombre){
		this.nombre = nombre;
	}
	
	@Override
	public String visualizar(){
		return this.nombre;
	}
}
