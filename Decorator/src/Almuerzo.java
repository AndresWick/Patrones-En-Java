
public class Almuerzo extends Comida{
	
	public Almuerzo(){
		descripcion = "Contiene: \n"+"Sopa\n"
				+"Pollo\n"+"Ensalada\n"+"Arroz\n";
		
		precio = 7000;
	}
	
	public String getDescripcion() {
		return descripcion;
	}

	public int getPrecio() {
		return precio;
	}
}
