/**
 *  Clase que representa la Papa como Adicion del restaurante.
 * @author Carlos
 *
 */
public class Papa extends Adicion{
	
	/**
    * Metodo encargado de retornar la descripcion de la comida con la adicion.
    */
	public String getDescripcion() {
		return super.getDescripcion()+"Papa\n";
	}

    /**
    * Metodo encargado de retornar el precio de la comida con la adicion.
    */
	public int getPrecio() {
		return super.getPrecio()+ 1200;
	}

	/**
	 *  Constructor de la clase.
	 * @param comida : objeto de la clase Comida que será recubierto.
	 */
	public Papa(Comida comida) {
		super(comida);
	}
}
