import java.util.ArrayList;
/**
 *  Clase que representa la categoria de Noticias de UDIN.
 * @author Carlos
 *
 */
public class UltimasNoticias extends CategoriaUdin{
	/**
     * Categorias de administracion. 
     */
	private ArrayList<SubCategoria> categorias = new ArrayList();

	@Override
	public String visualizar() {
	String text="==== Últimas Noticias ===="+"\n";
		
		for(int i=0;i<categorias.size();i++){
			text+="item: "+categorias.get(i).visualizar()+"\n";
		}
		return text;
	}
	/**
	 * Permite agregar una categoria a ultimas noticias.
	 */
	public void agregarCategoria(SubCategoria categoria){
		categorias.add(categoria);
	}
}
