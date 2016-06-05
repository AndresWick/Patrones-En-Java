import java.util.ArrayList;

import javax.swing.JOptionPane;
/**
 *  Clase que representa la categoria de Aula Virtual de UDIN.
 * @author Carlos
 *
 */
public class AulaVirtual extends CategoriaUdin{
	/**
	 * Nombre del aula.
	 */
	private String nombreAula;
	/**
	 * Nombre del profesor del aula.
	 */
	private String nombreProfesor;
	/**
	 * Links de los documentos del aula.
	 */
	private String documentos;
    /**
     * Categorias del aula. 
     */
	private ArrayList<CategoriaUdin> categorias = new ArrayList();
	
	/**
	 *  Constructor parametrico.
	 * @param nombreAula
	 * @param nombreProfesor
	 * @param documentos
	 */
	public AulaVirtual(String nombreAula, String nombreProfesor, String documentos){
		this.documentos = documentos;
		this.nombreAula = nombreAula;
		this.nombreProfesor = nombreProfesor;
	}
	
	@Override
	public String visualizar() {
		String text = "Nombre: "+nombreAula+"\n"+
				"Profesor: "+nombreProfesor+"\n"+
				"Documentos: "+documentos+"\n";
		
		for(int i=0;i<categorias.size();i++){
			text+=categorias.get(i).visualizar();
		}
		
		return text;
	}
	/**
	 * Permite agregar una categoria al aula.
	 */
	public void agregarCategoria(CategoriaUdin categoria){
		categorias.add(categoria);
	}
}
