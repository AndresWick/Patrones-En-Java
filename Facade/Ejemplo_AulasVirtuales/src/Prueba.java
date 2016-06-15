/**
 *  Clase prueba del patrón Fachada.
 * @author Carlos Aguirre, Daniel Garica.
 *
 */
public class Prueba {
/**
 *  Metodo principal.
 * @param args
 */
public static void main(String[] args) {
// Creamos una fachada del aula Modelos 1.
FachadaAulaModelos aula = new FachadaAulaModelos();
// Ingresamos al aula con un usuario.
aula.ingresar("20141020215", "123456");
	}
}
