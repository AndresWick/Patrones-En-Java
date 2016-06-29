import javax.swing.JOptionPane;
/**
 *  Clase que representa un aula virtual de UDIN,
 * @author Carlos Aguirre, Daniel Garcia.
 *
 */
public class AulaVirtual{
	/*** Estudiante del aula*/
	private Estudiante estudiante;
	/*** Promedio de nota de los estudiantes del aula*/
    private double promedioNotaAula;
	/**
	 *  Constructor parametrico.
	 * @param nombreUsuario
	 * @param codigoUsuario
	 */
	public AulaVirtual(double promedioNotaAula){
		this.promedioNotaAula = promedioNotaAula;
	}
	/**
	 *  Muestra en pantalla el promedio del estudiante del aula.
	 * @param nombreUsuario
	 * @param codigoUsuario
	 * @param notaEstudiante
	 */
	public void consultarPromedioEstudiante(String nombreUsuario,
			                            String codigoUsuario,
			                         double notaEstudiante){
		if(estudiante == null){
			estudiante = new Estudiante(nombreUsuario,codigoUsuario,notaEstudiante);
			JOptionPane.showMessageDialog(null, "Estudiante: "+estudiante.getNombre()+
					"\n"+ "Codigo: "+estudiante.getCodigo()+
					"\n"+ "Nota: "+estudiante.getNota()+
					"\n"+ "Promedio en salon: "+estudiante.calcularPromedio(promedioNotaAula));
		}else{
			estudiante.setNombre(nombreUsuario);
			estudiante.setCodigo(codigoUsuario);
			estudiante.setNota(notaEstudiante);
			JOptionPane.showMessageDialog(null, "Estudiante: "+estudiante.getNombre()+
					"\n"+ "Codigo: "+estudiante.getCodigo()+
					"\n"+ "Nota: "+estudiante.getNota()+
					"\n"+ "Promedio en salon: "+estudiante.calcularPromedio(promedioNotaAula));
			}
	}
}
