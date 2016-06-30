package proxy;
import javax.swing.JOptionPane;
/**
 *  Clase que representa un usuario Estudiante de UDIN.
 * @author Carlos Aguirre, Daniel Garcia.
 */
public class UsuarioEstudiante extends Usuario{
	/***  Contrase�a de ingreso del estudiante*/
	private String contrase�a; 
	/** Nombre de usuario*/
	private String nombre;
	/*** Estado del usuario*/
	private boolean estado;
	/** Estado de conectado del estudiante*/
	public static final boolean CONECTADO = true;
	/** Estado de desconectado del estudiante*/
	public static final boolean DESCONECTADO = false;
	/**
	 * Constructor parametrico.
	 */
	public UsuarioEstudiante(String nombre, String contrase�a){
		this.nombre = nombre;
		this.contrase�a = contrase�a;
	}
	/**
	 *  Retorna la contrase�a del estudiante.
	 * @return
	 */
	public String getContrase�a() {
		return contrase�a;
	}
    /**
     *  Retorna el estado del estudiante.
     * @return
     */
	public boolean isEstado() {
		return estado;
	}
	@Override
    public void mostrar(){
      JOptionPane.showMessageDialog(null,"DATOS DE ESTUDIANTE: "
    		+"\n"+"Nombre Usuario: "+nombre
    		+"\n"+"Contrase�a Usuario: "+contrase�a);
    	
    }
    @Override
    public void salir(){
     JOptionPane.showMessageDialog(null,"SALIDA EXITOSA.");
    }
	@Override
	public void ingresar() {
		estado = CONECTADO;
	    JOptionPane.showMessageDialog(null,"INGRESO EXITOSO");		
	}
}
