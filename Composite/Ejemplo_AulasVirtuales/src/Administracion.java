import java.util.ArrayList;
/**
 *  Clase que representa la categori de Administracion de UDIN.
 * @author Carlos
 *
 */
public class Administracion extends CategoriaUdin{
	/**
     * Categorias de administracion. 
     */
	private ArrayList<SubCategoria> categorias = new ArrayList();

	@Override
	public String visualizar() {
		String text="==== Administración ===="+"\n";
		
		for(int i=0;i<categorias.size();i++){
			text+="item: "+categorias.get(i).visualizar()+"\n";
		}
		return text;
	}
	/**
	 * Permite agregar una categoria a administracion.
	 */
	public void agregarCategoria(SubCategoria categoria){
		categorias.add(categoria);
	}
}
