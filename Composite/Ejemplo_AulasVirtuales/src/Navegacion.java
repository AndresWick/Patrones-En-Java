import java.util.ArrayList;
/**
 *  Clase que representa la categoria de Navegacion de UDIN.
 * @author Carlos
 *
 */
public class Navegacion extends CategoriaUdin{
	/**
     * Categorias de navegacion. 
     */
	private ArrayList<SubCategoria> categorias = new ArrayList();

	@Override
	public String visualizar() {
		String text="==== Navegación ===="+"\n";
		
		for(int i=0;i<categorias.size();i++){
			text+="item: "+categorias.get(i).visualizar()+"\n";
		}
		return text;
	}
	/**
	 * Permite agregar una categoria a navegacion.
	 */
	public void agregarCategoria(SubCategoria categoria){
		categorias.add(categoria);
	}
}
