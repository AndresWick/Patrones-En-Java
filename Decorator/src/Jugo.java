
public class Jugo extends Adicion{
	
	/**
	 * 
	 * @param comida
	 */
	public Jugo(Comida comida) {
		super(comida);
	}

	public String getDescripcion() {
		return super.getDescripcion() + "Jugo\n";
	}

	public int getPrecio() {
		return super.getPrecio() + 2000;
	}
}
