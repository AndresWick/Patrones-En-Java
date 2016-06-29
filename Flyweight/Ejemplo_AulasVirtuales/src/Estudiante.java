/**
 *  Clase que representa a un estudiante
 *  como usuario de UDIN.
 * @author Carlos Aguirre, Daniel Garcia.
 *
 */
public class Estudiante{
	/*** Nombre del estudiante*/
	private String nombre;
	/*** Codigo del estudiante*/
	private String codigo;
	/*** nota del estudiante*/
	private double nota;
  /**
   * Constructor parametrico. 
   * @param nombre
   * @param codigo
   */
	public Estudiante(String nombre, String codigo, double nota){
		this.nombre = nombre;
		this.codigo = codigo;
		this.nota = nota;
	}
	/**
	 *  Retorna el nombre del estudiante.
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 *  Retorna el codigo del estudiante.
	 * @return
	 */
	public String getCodigo() {
		return codigo;
	}
	/**
	 *  Retorna la nota del estudiante.
	 * @return
	 */
	public double getNota() {
		return nota;
	}
	/**
	 *  Calcula el promedio del estudiante.
	 * @param promedioGeneral
	 * @return
	 */
	public double calcularPromedio(double promedioGeneral){
		return (nota+promedioGeneral)/2;
	}
	/**
	 *  Modifica el nombre del estudiante.
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 *  Modifica el codigo del estudiante.
	 * @param codigo
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	/**
	 *  Modifica la nota del estudiante.
	 * @param nota
	 */
	public void setNota(double nota) {
		this.nota = nota;
	}
}
