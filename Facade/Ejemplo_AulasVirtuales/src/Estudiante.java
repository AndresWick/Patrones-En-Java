/**
 *  Clase que representa un estudiante que ser�
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
 * Contrase�a del estudiante.
 */
private String contrase�a;
/**
 *  Constructor parametrico.
 * @param nombre
 * @param contrase�a
 */
public Estudiante(String nombre, String contrase�a){
	this.nombre = nombre;
	this.contrase�a = contrase�a;
}
public String getNombre() {
	return nombre;
}
public String getContrase�a() {
	return contrase�a;
}
}
