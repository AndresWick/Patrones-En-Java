/**
 *  Clase encargada de convertir un String a un entero.
 * @author Carlos
 *
 */
public class Converter{

    /**
     *  Almacena el texto numero ya convertido.	
     */
    private int numero;
	



    /**
     *  Constructor de la clase que inicia a numero con valor cero.
     */
	public Converter(){
		this.numero=0;
	}
	
	/**
	 *  Metodo encargado de convertir como tal una variable String a un entero.
	 * @param texto : texto que se desea convertir.
	 * @return : numero.
	 */
	public int convert(String texto){
	    this.numero=Integer.parseInt(texto);
		return this.numero;
		
	}

}
