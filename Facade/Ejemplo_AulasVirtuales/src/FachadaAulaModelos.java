/**
 *  Clase fachada del aula MODELOS 1.
 * @author Carlos Aguirre, Daniel Garcia.
 *
 */
public class FachadaAulaModelos {
	/**
	 * Aula de la fachada.
	 */
	private AulaVirtual aula;
	/**
	 * Constructor por defecto que
	 * crea el aula de MODELOS 1.
	 */
	public FachadaAulaModelos(){
		aula = new AulaVirtual("Modelos 1", "JULIO BARON", "syllabus");
		aula.registrarEstudiante("20141020215", "123456");
		aula.registrarEstudiante("20141020212", "654321");
	}
	/**
	 * Metodo para ingresar al aula.
	 * @param nombreUsuario
	 * @param contraseña
	 */
	public void ingresar(String nombreUsuario, String contraseña){
		aula.login(nombreUsuario, contraseña);
	}
}

