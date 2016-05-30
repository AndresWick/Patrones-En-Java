/**
 *  Clase que representa un Jugo como Adicion del restaurante.
 * @author Carlos
 *
 */
public class Jugo extends Adicion{
	
	/**
	 *  Constructor de la clase.
	 * @param comida : nuevo Objeto de tipo Comida el cual se recubrirá.
	 */
	public Jugo(Comida comida) {
		super(comida);
	}

    /**
    * Metodo encargado de retornar la descripcion de la comida con la adicion.
    */
	public String getDescripcion() {
		return super.getDescripcion() + "Jugo\n";
	}

    /**
    * Metodo encargado de retornar el precio de la comida con la adicion.
    */
	public int getPrecio() {
		return super.getPrecio() + 2000;
	}
}
