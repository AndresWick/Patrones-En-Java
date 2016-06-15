import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *  Clase que representa el Aula Virtual de UDIN.
 * @author Carlos Aguirre, Daniel Garcia.
 *
 */
public class AulaVirtual {
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
     * Estudiantes registrados en el aula. 
     */
	private ArrayList<Estudiante> estudiantes = new ArrayList();
	/**
	 *  Constructor parametrico.
	 * @param nombreAula
	 * @param nombreProfesor
	 * @param documentos
	 */
	public AulaVirtual(String nombreAula, String nombreProfesor,
			String documentos){
		this.documentos = documentos;
		this.nombreAula = nombreAula;
		this.nombreProfesor = nombreProfesor;
	}
	/**
	 *  Metodo que verifica el ingreso de un estudiante
	 *  al aula Modelos 1.
	 * @param nombreUsuario
	 * @param contrase�a
	 * @return
	 */
	public boolean verificarEstudiante(String nombreUsuario,
			String contrase�a){
		for(int i=0;i<estudiantes.size();i++){
			if(estudiantes.get(i).getNombre()==nombreUsuario 
				&& estudiantes.get(i).getContrase�a()==contrase�a){
				return true;
			}
		}
		return false;
	}
	/**
	 *  Registra a un estudiante en el aula Modelos 1.
	 * @param nombreUsuario
	 * @param contrase�a
	 */
	public void registrarEstudiante(String nombreUsuario,
			String contrase�a){
		estudiantes.add(new Estudiante(nombreUsuario,contrase�a));
	}
	/**
	 *  Metodo que permite el ingreso de un estudiante al aula.
	 * @param nombreUsuario
	 * @param contrase�a
	 */
	public void login(String nombreUsuario, String contrase�a){
		for(int i=0;i<estudiantes.size();i++){
			if(estudiantes.get(i).getNombre()==nombreUsuario 
				&& estudiantes.get(i).getContrase�a()==contrase�a){
				JOptionPane.showMessageDialog(null, "INGRESO EXITOSO"+
				"\n"+"Usuario: "+nombreUsuario+
				"\n"+"Aula: "+nombreAula+
				"\n"+"Profesor: : "+nombreProfesor+
				"\n"+"Documentos: "+documentos);
			}
		}
		JOptionPane.showMessageDialog(null, "Datos err�neos. Por favor,"
				+ " int�ntelo otra vez."); 
	}
}
