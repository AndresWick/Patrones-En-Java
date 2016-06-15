/**
 *  Clase que representa un estudiante que será
 *  registrado en UDIN.
 * @author Carlos Aguirre, Daniel Garcia.
 *
 */
public class Estudiante {
/**
 * Nombre del estudiante.
 */
private String nombre;
/**
 * Contraseña del estudiante.
 */
private String contraseña;
/**
 *  Constructor parametrico.
 * @param nombre
 * @param contraseña
 */
public Estudiante(String nombre, String contraseña){
	this.nombre = nombre;
	this.contraseña = contraseña;
}
public String getNombre() {
	return nombre;
}
public String getContraseña() {
	return contraseña;
}
}
