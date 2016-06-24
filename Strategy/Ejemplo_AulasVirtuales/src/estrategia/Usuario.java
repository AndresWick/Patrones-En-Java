package estrategia;
/**
 *  Clase que representa un usuario de UDIN.
 * @author Carlos Aguirre, Daniel Garcia.
 *
 */
public class Usuario {
/*** Ingreso del usuario. */
private Ingreso ingreso;
 /**
 *  Retorna la entrada del usuario.
 * @param ingreso
 */
 public void setIngreso(Ingreso ingreso) {
	this.ingreso = ingreso;
 }
 /**
 * Metodo que permite el ingreso del usuario.
 */
 public void ingresar() {
	ingreso.ingresar();
 }
}

