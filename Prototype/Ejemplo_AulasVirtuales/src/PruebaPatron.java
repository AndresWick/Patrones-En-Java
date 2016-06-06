/**
 *  Prueba del patrón.
 * @author Carlos
 *
 */
public class PruebaPatron {

	/**
	 *  Metodo principal.
	 * @param args
	 */
	public static void main(String[] args) {
        // Creamos un aula virtual
		AulaVirtual aulaModelos = new AulaVirtual("Modelos I");
		// Agregamos dos archivos al aula
		aulaModelos.agregarArchivo("Pensum", "PDF");
		aulaModelos.agregarArchivo("Presentación", "PPTX");
		//Supongamos que un estudiante matriculado en el aula
		// desea descargar el pensum    ---->     No se recibe el mismo documento sino una copia exacta del mismo.
		ArchivoAula archivoDescargado = aulaModelos.getArchivos().get(0).descargarArchivo();
		
		//Consultamos el archivo descargado del aula
		System.out.println("Nombre archivo descargado: "+archivoDescargado.getNombre()
				+"\n"+"Formato archivo descargado: "+archivoDescargado.getFormato()
				);
	}

}
