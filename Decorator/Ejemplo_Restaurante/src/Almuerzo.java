/**
 *  Clase que representa un almuerzo del restaurante.
 * @author Carlos
 *
 */
public class Almuerzo extends Comida{
	
	/**
	 *  Constructor de la clase.
	 */
	public Almuerzo(){
		descripcion = "Contiene: \n"+"Sopa\n"
				+"Pollo\n"+"Ensalada\n"+"Arroz\n";
		
		precio = 7000;
	}
	
	/**
	 *  Metodo encargado de retornar la descripcion del almuerzo.
	 */
	public String getDescripcion() {
		return descripcion;
	}
    
    /**
	 *   Metodo encargado de retornar el precio del almuerzo.
	 */
	public int getPrecio() {
		return precio;
	}
}
