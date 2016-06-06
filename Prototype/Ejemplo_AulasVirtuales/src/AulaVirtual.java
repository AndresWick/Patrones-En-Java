import java.util.ArrayList;
/**
 *  Clase que representa un aula virtual de UDIN.
 * @author Carlos
 *
 */
public class AulaVirtual {
	/**
	 *  Nombre del aula.
	 */
	 private String nombre;
	 /**
	  * Documentos con los que cuenta el aula.
	  */
	 private static ArrayList <ArchivoAula> archivos;
	/**
	 *  Constructor parametrico.
	 * @param nombre
	 */
	public AulaVirtual(String nombre){
		  archivos = new ArrayList <ArchivoAula>();
		  this.nombre = nombre;
	}

	/**
	 *  Metodo que permite agregar documentos al aula.
	 * @param nombreArchivo
	 * @param formatoArchivo
	 */
	public void agregarArchivo(String nombreArchivo, String formatoArchivo){
	    archivos.add(new ArchivoAula(nombreArchivo,formatoArchivo));  
	}

	/**
	 *  Metodo que retorna todos los documentos del aula.
	 * @return
	 */
	public static ArrayList<ArchivoAula> getArchivos() {
		return archivos;
	}
}
