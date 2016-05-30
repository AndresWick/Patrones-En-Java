/**
 *  Clase que representa una adicion de un alimento.
 * @author Carlos
 *
 */
public class Adicion extends Comida{
	/**
	 *  Objeto de tipo comida al que se le agregara la adicion.
	 */
    protected Comida comida;




	/**
	 *   Constructor de la clase.
	 * @param comida : obejeto que se asigna a comida de esta clase.
	 */
	public Adicion(Comida comida){
		this.comida = comida;
	}
	
	/**
	 *  metodo que retorna la descripcion de la comida.
	 */
	public String getDescripcion(){
		return comida.getDescripcion();
	}

    /**
	 *  Metodo que retorna el precio de la comida.
	 */
	public int getPrecio(){
		return comida.getPrecio();
	}
}
