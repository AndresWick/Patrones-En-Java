/**
 *  Clase prueba del patrón.
 * @author Carlos
 *
 */
public class Prueba {
    
    /**
    * Clase principal del programa.
    */
	public static void main(String[] args) {
		
	    	// Compramos un almmuerzo 
	        Comida almuerzo = new Almuerzo();
	        // Pedimos un jugo extra
	        Adicion conJugo = new Jugo(almuerzo);
	        // Luego pedimos una porcion de papa
	        Adicion conPapa = new Papa(conJugo);
	        
	        // Imprimimos la factura
	        System.out.println(conPapa.getDescripcion()
	                +"El valor total:"+conPapa.getPrecio());
	   
	}

}
